import java.io.*;
import java.net.*;



public class readFile {

	final static int size = 1024;
	
	public static void fileUrl(String fAddress, String localFileName, String destinationDir) {

		OutputStream outStream = null;
        URLConnection uCon = null;
        InputStream is = null;
        
        try {
            URL url;
           
            
            url = new URL(fAddress);
            outStream = new BufferedOutputStream(new FileOutputStream(destinationDir + "\\" + localFileName));

            uCon = url.openConnection();
            is = uCon.getInputStream();
           
           
            System.out.println("Downloaded Successfully.");
            System.out.println("File name:\"" + localFileName);
            
            if(localFileName.endsWith(".pdf"))
            {
            	System.out.println("PDF file is downloaded");
            }
            else
            {
            	System.out.println("Not a PDF file");
            }
            
        }
        
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        
        finally 
        {
            try {
                is.close();
                outStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	}
        
        public static void fileDownload(String fAddress, String destinationDir) 
        {
            int slashIndex = fAddress.lastIndexOf('/');
            int periodIndex = fAddress.lastIndexOf('.');
            
            

            String fileName = fAddress.substring(slashIndex + 1);

            if (periodIndex >= 1 && slashIndex >= 0 && slashIndex < fAddress.length() - 1) 
            {
                fileUrl(fAddress, fileName, destinationDir);
 
            } 
            
            else 
            {
                System.err.println("path or file name.");
            }
            
            
        }
        
        
        
        
        
       
        
        
       
}


