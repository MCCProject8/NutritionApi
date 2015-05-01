package designComponents;


import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;


public class Borders {
	
public static Border blackline = BorderFactory.createLineBorder(Color.black);
public static Border redline = BorderFactory.createLineBorder(Color.RED, 2);
public static Border lightwhiteline = BorderFactory.createLineBorder(Color.WHITE);
public static Border raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
public static Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
public static Border raisedbevel = BorderFactory.createRaisedBevelBorder();
public static Border loweredbevel = BorderFactory.createLoweredBevelBorder();
public static Border empty = BorderFactory.createEmptyBorder();
	
}
