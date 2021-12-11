package by.bsuir.WebTech.Lab4.controller.command;

import by.bsuir.WebTech.Lab4.exception.ServiceException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
    CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException;
}
