package com.aspose.slides.examples.Presentation.Opening;

import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class  DetectionMicrosoftPowerPoint95presentations{

	public static final void main(String[] args) {
		
		// The path to the documents directory.
        	String dataDir = Utils.getDataDir(DetectionMicrosoftPowerPoint95presentations.class);
        
		//Code snippet to check whether the presentation format is old Microsoft PowerPoint 95
         boolean isOldFormat = PresentationFactory.getInstance().getPresentationInfo(path).getLoadFormat() == LoadFormat.Ppt95;

	}
}
