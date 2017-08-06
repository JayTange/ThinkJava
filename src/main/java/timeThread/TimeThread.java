package timeThread;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
/**
 *  定时线程，定时检测磁盘空间
 * @author 唐杰
 *
 */
public class TimeThread {
	static int i = 0;
	public static void main(String args[]){
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {

				File[] root = File.listRoots();
				long free = 0;
				for(int i = 0;i<root.length;i++){
					File f = root[i];
					long total = f.getTotalSpace();
					if(total == 0)
						continue;
					free +=f.getFreeSpace();
				}
				System.out.println("磁盘的总容量为： "+free/(1024*1024*1024)+"G");
			
				System.out.println("次数： "+(i++));
			
			} 
		};
		Timer timer = new Timer();
		long delay = 0;
		long intervalPeriod = 1000*60;
		timer.scheduleAtFixedRate(task, delay, intervalPeriod);
	}
}
