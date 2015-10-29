package se.bth.swatkats.letstalk.file.upload;
/**
 * The user class to observe file upload progress 
 * 
 * @author Jyoti
 *
 */ 
import java.util.Observable;
import java.util.Observer;
import se.bth.swatkats.letstalk.connection.GuiHandler;
public class user implements Observer {
	private int uploaded;
	private fileupload file;
	public user(fileupload file){
	      this.file = file;
	   }
@Override
	   public void update(Observable obs, Object obj) {
		if (obs == file)
		{
		   this.uploaded=(int) file.getValue(); 
                   GuiHandler.getInstance().getGui().updateUploadProgress(uploaded);
	   }
}
}
