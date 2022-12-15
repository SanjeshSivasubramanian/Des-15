package org.India;

public class SouthInd extends Indians {
@Override
public void breakFast() {
    System.out.println("Dosa");
}
public static void main(String[] args) {
	SouthInd s = new SouthInd();
	s.voterId();
	s.panCard();
	s.breakFast();
}
}
