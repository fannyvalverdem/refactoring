/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largeClass.bad;

import java.util.Date;

/**
 *
 * @author Fanny
 */
class Reporte {
  //...
  void sendReport() {
    Date nextDay = new Date(previousEnd.getYear(),previousEnd.getMonth(), previousEnd.getDate() + 1);
  }
}