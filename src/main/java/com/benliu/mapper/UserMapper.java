package com.benliu.mapper;

import java.util.List;

import com.benliu.entity.Line;
import com.benliu.entity.Machine;
import com.benliu.entity.User;

/**
 * Created by kunlun on 2016/10/29.
 */
public interface UserMapper {

    String login(String user, String password);

    List<User> getUserList(String user, String password);


    void register(String user, String password);

    List<Machine> getMachineList();

    List<Machine> getMachinesByLineId(int lineId);

    Machine getMachineById(int macId);

    List<Line> getLines();

    List<Line> getLinesByAreaId(int areaId);

    String getRegister(String user);
}
