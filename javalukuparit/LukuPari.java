/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalukuparit;

/**
 *
 * @author sakari
 */
public class LukuPari {
int luku1;
int luku2;

LukuPariTesti testi = new LukuPariTesti();

 // Setter
  public void setLuku1(int c) {
    this.luku1 = c;
  }
  
  // Setter
  public void setLuku2(int c) {
    this.luku2 = c;
  }
  
  public void LukuPari(int a, int b) {
    this.setLuku1(a);
    this.setLuku2(b);
  }
    
}
