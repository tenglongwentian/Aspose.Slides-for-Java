package com.aspose.slides.examples.Text;

import com.aspose.slides.FontsLoader;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class LoadExternalFonts {

	public static void main(String[] args) {
            
// ExStart:AddEmbeddedFonts
		// The path to the documents directory.
		
         String dataDir = Utils.getDataDir(AddEmbeddedFonts.class);

IFontData[] allFonts = pres.getFontsManager().getFonts();
IFontData[] embeddedFonts = pres.getFontsManager().getEmbeddedFonts();
for (IFontData font : except(allFonts, embeddedFonts))
{
pres.getFontsManager().addEmbeddedFont(font, EmbedFontCharacters.All);
}
              // ExEnd:AddEmbeddedFonts
	
}

}
