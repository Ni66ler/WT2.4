package by.bsuir.WebTech.Lab4.controller.command.admin;

import by.bsuir.WebTech.Lab4.controller.command.Command;
import by.bsuir.WebTech.Lab4.controller.command.CommandResult;
import by.bsuir.WebTech.Lab4.entity.Room;
import by.bsuir.WebTech.Lab4.exception.ServiceException;
import by.bsuir.WebTech.Lab4.service.RoomService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class DeoccupyRoomCommand implements Command {
    private static final String MAIN_PAGE = "controller?command=showRooms";
    private static final String ROOM_LIST = "roomList";
    private static final String ROOM_ID = "roomId";

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        String roomId = request.getParameter(ROOM_ID);

        RoomService roomService = new RoomService();
        roomService.changeStatus(Integer.valueOf(roomId), false);

        List<Room> roomList = roomService.findAll();
        request.setAttribute(ROOM_LIST, roomList);

        return CommandResult.redirect(MAIN_PAGE);
    }
}
