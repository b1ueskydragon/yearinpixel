package app.controller;

import app.model.EverydaySearch;
import app.service.EverydayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

  @Autowired
  EverydayService everydayService;

  @RequestMapping(value = {"", "/everydays"}, method = RequestMethod.GET)
  public String showList(@ModelAttribute EverydaySearch search) {

    search.setEverydays(everydayService.everydays(1));

    return "everydays";
  }
}
