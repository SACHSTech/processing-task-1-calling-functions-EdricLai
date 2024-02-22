/*
 * Description: sketches a house 
 * Author: Edric
*/

import processing.core.PApplet;

public class Sketch extends PApplet {

  /*
   * called once
   * initial settings
   */
  public void settings() {
	// window size
    size(700, 500);
  }

  /*
   * called once
   * initial setup values
   */
  public void setup() {
    // background color
    background(0, 50, 100);
  }

  /*
   * called repeatedly
   * draws items
   */
  public void draw() {
    // draws hill
    fill(0,150,0);
    ellipse(350,650,1400,500);

    // draws moon
    fill(200,200,200);
    ellipse(150,150,150,150);

    // draws base
    fill(200,180,150);
    rect(200, 350, 300, 150);
    rect(400,200,50,150);

    // draws roof
    fill(180,160,130);
    triangle(200,350,350,200,500,350);

    // draws door
    fill(220,200,170);
    rect(325,400,50,100);

    // draws windows
    fill(160,140,110);
    ellipse(250,400,50,50);
    ellipse(450,400,50,50);
  }

}