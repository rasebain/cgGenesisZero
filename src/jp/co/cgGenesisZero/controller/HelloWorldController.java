package jp.co.cgGenesisZero.controller;

import javax.servlet.http.HttpServletRequest;

import jp.co.cgGenesisZero.Logic.LoginLogic;
import jp.co.cgGenesisZero.Logic.LoginLogicImpl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class HelloWorldController {
 
  @RequestMapping("/")
  public String hello() {
    return "hello";
  }
 
  @RequestMapping(value = "/hi", method = RequestMethod.GET)
  public String hi(HttpServletRequest req, Model model) {
    String message = "Hi " + req.getParameter("name") + "!";
    model.addAttribute("message", message);
    LoginLogic logic = new LoginLogicImpl();
    logic.logIn("wiz", "19881004", req.getSession().getId());
    return "hi";
  }
 
}