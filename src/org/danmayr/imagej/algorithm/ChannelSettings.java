package org.danmayr.imagej.algorithm;

import org.danmayr.imagej.algorithm.pipelines.*;

import ij.ImagePlus;
import ij.process.AutoThresholder;


public class ChannelSettings implements Cloneable{
    public ImagePlus mChannelImg;
    public int mChannelNr=0;
    public Pipeline.ChannelType type;
    public AutoThresholder.Method mThersholdMethod;
    public boolean enhanceContrast;
    public int minThershold = -1;
    public int maxThershold = 65535;
    public String ZProjector = "OFF";

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
