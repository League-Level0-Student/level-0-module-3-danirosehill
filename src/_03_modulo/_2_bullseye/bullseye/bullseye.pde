

void setup() {
 
  // set the size of your sketch
  size (500,500);
}

void draw() {
  int i;
  int x= 200;
  int y= 200;
  for (i=0; i < 8 ; i++) {
    ellipse (250, 250, x-=20, y-=20);
    if (i % 2 == 0) {
    fill(#E82525);
    } else { 
    fill(#030202);
    }
  }
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
