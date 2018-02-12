package jar.by1003917294.verbatimprint;

import android.os.*;

public class VerbatimPrint
{
	private String content = "";
	private int location = 0;
	private int time = 0;
	private OnVerbatimPrintRunListener listener;
	
	public VerbatimPrint(String content,int time)
	{
		this.content = content;
		this.time = time;
	}
	public VerbatimPrint(CharSequence content,int time)
	{
		this.content = content.toString();
		this.time = time;
	}
	
	public void setOnVerbatimPrintRunListener(OnVerbatimPrintRunListener listener)
	{
		this.listener = listener;
		start();
	}
	
	private void start()
	{
		final int length = content.length();
		new Handler().postDelayed(new Runnable(){
				public void run(){
					if(location <= length)
					{
						String text = content.substring(0,location);
						listener.onRunning(text);
						location += 1;
						start();
					}
				}
		},time);
	}
}

interface OnVerbatimPrintRunListener
{
	public void onRunning(String text);
}
