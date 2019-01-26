package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

  @RequestMapping(value = "/everydays", method = RequestMethod.GET)
  public String showList() {
    System.out.println();
    return "everydays";
  }
}
