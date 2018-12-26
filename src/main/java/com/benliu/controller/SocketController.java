package com.benliu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.benliu.entity.Area;
import com.benliu.entity.City;
import com.benliu.entity.Line;
import com.benliu.entity.Machine;
import com.benliu.entity.VMac;
import com.benliu.mapper.AreaMapper;
import com.benliu.mapper.CityMapper;
import com.benliu.mapper.UserMapper;
import com.benliu.mapper.VMacMapper;
import com.benliu.service.SocketService;
import com.benliu.utils.ResponseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Created by kunlun on 2016/11/17.
 */
@Controller
public class SocketController {

	@Autowired
	private SocketService socketService;
    
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private VMacMapper vMacMapper;
    @Autowired
    private CityMapper cityMapper;
    @Autowired
    private AreaMapper areaMapper;


    /**
     * 获取在线通信机列表
     * @param request
     * @param response
     */
    @RequestMapping(value = "/online", method = RequestMethod.GET)
    public void getOnline(HttpServletRequest request, HttpServletResponse response) {
        String online = socketService.getContextViaSocket("GET /online HTTP/1.1\r\n\r\n");
        JSONArray onlineArray = JSONArray.fromObject(online);

        JSONObject ret = new JSONObject();
        ret.put("online", onlineArray);

        if (!online.equals("")) {
            ResponseUtil.responseJSON(response, ret);
        } else {
            ResponseUtil.responseJSON(response, new JSONArray().toString());
        }
    }

    /**
     * 获取全部通讯机的信息
     * @param request
     * @param response
     */
    @RequestMapping(value = "/machineList", method = RequestMethod.GET)
    public void getMachineList(HttpServletRequest request, HttpServletResponse response) {
        List<Machine> machineList = userMapper.getMachineList();
        List<Line> lineList = userMapper.getLines();

        JSONArray lineArray = new JSONArray();
        if(null != lineList && !lineList.isEmpty()) {
	        for (int i = 0; i < lineList.size(); i++) {
	        	lineArray.add(i, lineList.get(i).toJSON());
	            for (Machine machine : machineList) {
	            	int lineId = machine.getLineId();
	            	if (lineId == lineList.get(i).getId()) {
	                    lineArray.getJSONObject(i).getJSONArray("machineList").add(machine.toJSON());
	                }
	            }
	        }
        }
        JSONObject ret = new JSONObject();
        ret.put("machines", lineArray);

        ResponseUtil.responseJSON(response, ret);
    }

    /**
     * 获取该用户所在市全部通讯机的信息
     * @param request
     * @param response
     */
    @RequestMapping(value = "/machineListByUser", method = RequestMethod.GET)
    public void getMachineListByUser(HttpServletRequest request, HttpServletResponse response) {
        String machineId = request.getParameter("cityId");
        int a = Integer.parseInt(machineId);
        List<Machine> machineList = userMapper.getMachineList();
        List<Line> lineList = userMapper.getLines();

        JSONArray lineArray = new JSONArray();
        int length = lineList.size();
        for (int i = 0; i < length; i++) {
            lineArray.add(i, lineList.get(i).toJSON());
            for (Machine machine : machineList) {
            	int lineId = machine.getLineId();
            	if (lineId == lineList.get(i).getId()) {
                    lineArray.getJSONObject(i).getJSONArray("machineList").add(machine.toJSON());
                }
            }
        }

        JSONObject ret = new JSONObject();
        JSONArray lineAndMachineArray = new JSONArray();
        for (int i = 0; i < lineArray.size(); i++) {
            if (lineArray.getJSONObject(i).getInt("cityId") == a) {
            	lineAndMachineArray.add(lineArray.getJSONObject(i));
            }
        }
        ret.put("machines", lineAndMachineArray);

        ResponseUtil.responseJSON(response, ret);
    }

    /**
     * 获取该用户所在市全部通讯机的信息
     * @param request
     * @param response
     */
    @RequestMapping(value = "/machineListByUserNew", method = RequestMethod.GET)
    public void getMachineListByUserNew(HttpServletRequest request, HttpServletResponse response) {
        String cityType = request.getParameter("cityType");
        String cityId = request.getParameter("cityId");
        int type = Integer.parseInt(cityType);
        int a = Integer.parseInt(cityId);
        
        JSONObject ret = new JSONObject();
        JSONArray lineAndMachineArray = new JSONArray();
        JSONObject areaJson = null;
        if (type == 8) {
        	JSONObject resLine = null;
            List<Line> lineList = userMapper.getLines();
            
            if(null != lineList && !lineList.isEmpty()) {
	            JSONArray lineArray = new JSONArray();
	            for (int i = 0; i < lineList.size(); i++) {
	                lineArray.add(i, lineList.get(i).toJSON());
	            }
	
	            for (int m = 0; m < lineArray.size(); m++) {
	                if (lineArray.getJSONObject(m).getInt("id") == a) {
	                	resLine = lineArray.getJSONObject(m);
	                	break;
	                }
	            }
	
	            List<VMac> vMacs = null;
	
	            Area area = areaMapper.getAreaById(resLine.getInt("cityId"));
	            areaJson = area.toJSON();
	
	            if (resLine.getInt("lineType") == 0) {
	                setMachineList(resLine);
	            } else {
	                int lineId = resLine.getInt("id");
	                vMacs = vMacMapper.getVMacByLineId(lineId);
	                if(null != vMacs && !vMacs.isEmpty()) {
		                VMac vMac = null;
		                for (int i = 0; i < vMacs.size(); i++) {
		                    vMac = vMacs.get(i);
		                    Machine machine = userMapper.getMachineById(vMac.getMacId());
		                    machine.setvMac(vMac.toJSON());
		                    resLine.getJSONArray("machineList").add(machine.toJSON());
		                }
	                }
	            }
	            areaJson.getJSONArray("lineList").add(resLine);
            }

        } else if (type == 1) {
            City city = cityMapper.getCithById(a);
            if(null != city) {
	            List<Area> areas = areaMapper.getAreasByCityId(city.getCityId());
	            if(null != areas && !areas.isEmpty()) {
		            Area area = null;
		            for (int j = 0; j < areas.size(); j++) {
		                area = areas.get(j);
		                areaJson = area.toJSON();
		                getLineList(areaJson, area);
		            }
	            }
            }
        } else if (type == 2) {
            Area area = areaMapper.getAreaById(a);
            if(null != area) {
	            areaJson = area.toJSON();
	            getLineList(areaJson, area);
            }
        }
        lineAndMachineArray.add(areaJson);
        ret.put("areas", lineAndMachineArray);
        
        ResponseUtil.responseJSON(response, ret);
    }

	private void setMachineList(JSONObject resLine) {
		List<Machine> machinesOfLine = userMapper.getMachinesByLineId(resLine.getInt("id"));
		if(null != machinesOfLine && !machinesOfLine.isEmpty()) {
		    for (Machine machine : machinesOfLine) {
		        resLine.getJSONArray("machineList").add(machine.toJSON());
		    }
		}
	}

    /**
     * 获取并封装lineList
     * @param areaJson
     * @param area
     */
	private void getLineList(JSONObject areaJson, Area area) {
		List<Line> lineList = userMapper.getLinesByAreaId(area.getAreaId());
		if(null != lineList && !lineList.isEmpty()) {
		    for (int k = 0; k < lineList.size(); k++) {
		        Line line = lineList.get(k);

		        JSONObject resLine = line.toJSON();

		        if (resLine.getInt("lineType") == 0) {
		            setMachineList(resLine);
		        } else {
		            List<VMac> vMacs = vMacMapper.getVMacByLineId(resLine.getInt("id"));
		            if(null != vMacs && !vMacs.isEmpty()) {
		                VMac vMac = null;
		                for (int i = 0; i < vMacs.size(); i++) {
		                    vMac = vMacs.get(i);
		                    Machine machine = userMapper.getMachineById(vMac.getMacId());
		                    if(null != machine) {
		                    	resLine.getJSONArray("machineList").add(machine.toJSON());
		                    }
		                }
		            }
		        }
		        areaJson.getJSONArray("lineList").add(resLine);
		    }
		}
	}


    /**
     * 电网输入端的状态
     * @param request
     * @param response
     */
    @RequestMapping(value = "/powerState", method = RequestMethod.GET)
    public void getPowerState(HttpServletRequest request, HttpServletResponse response) {
        String machineId = request.getParameter("machineId");
        String order = "GET /powerState?txjid=" + machineId + " HTTP/1.1\r\n\r\n";
        responseResult(response, order);
    }

    //返回各个电容器的运行状态
    @RequestMapping(value = "/capaState", method = RequestMethod.GET)
    public void getCapaState(HttpServletRequest request, HttpServletResponse response) {
        String machineId = request.getParameter("machineId");
        String order = "GET /capaState?txjid=" + machineId + " HTTP/1.1\r\n\r\n";
        responseResult(response, order);
    }

    //调压器的状态
    @RequestMapping(value = "/adjustorState", method = RequestMethod.GET)
    public void getAdjustorState(HttpServletRequest request, HttpServletResponse response) {
        String machineId = request.getParameter("machineId");
        String order = "GET /adjustorState?txjid=" + machineId + " HTTP/1.1\r\n\r\n";
        responseResult(response, order);
    }

    //电网输出端的状态
    @RequestMapping(value = "/outEndState", method = RequestMethod.GET)
    public void getOutEndState(HttpServletRequest request, HttpServletResponse response) {
        String machineId = request.getParameter("machineId");
        String order = "GET /outEndState?txjid=" + machineId + " HTTP/1.1\r\n\r\n";
        responseResult(response, order);
    }

    //电网输入端的状态
    @RequestMapping(value = "/inEndState", method = RequestMethod.GET)
    public void getInEndState(HttpServletRequest request, HttpServletResponse response) {
        String machineId = request.getParameter("machineId");
        String order = "GET /inEndState?txjid=" + machineId + " HTTP/1.1\r\n\r\n";
        responseResult(response, order);
    }

    /**
     * 返回结果数据
     * @param response
     * @param outEndState
     */
    private void responseResult(HttpServletResponse response, String order) {
    	String state = socketService.getContextViaSocket(order);
    	if (!state.equals("")) {
    		ResponseUtil.responseJSON(response, state);
    	} else {
    		JSONObject ret = new JSONObject();
    		ResponseUtil.responseJSON(response, ret);
    	}
    }
}