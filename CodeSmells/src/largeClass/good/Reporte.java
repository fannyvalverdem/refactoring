/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largeClass.good;

import java.util.Date;

/**
 *
 * @author Fanny
 */
class Reporte {
  //...
    void sendReport() {
        Date previousEnd = null;
        Date newStart = nextDay(previousEnd);
      //...
    }
    private static Date nextDay(Date arg) {
        return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
    }
}
