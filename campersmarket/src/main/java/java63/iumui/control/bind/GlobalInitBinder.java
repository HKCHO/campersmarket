package java63.iumui.control.bind;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class GlobalInitBinder {
  static Logger log = Logger.getLogger(GlobalInitBinder.class);
  
  @InitBinder
  public void initBinder(WebDataBinder binder) {
    log.debug("initBinder() 호출됨");
    SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd");
    dateFormat.setLenient(false);
    
    binder.registerCustomEditor(
        Date.class,
        new CustomDateEditor(dateFormat, true)
        );
  }
}












