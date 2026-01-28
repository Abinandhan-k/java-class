package pack1;
import java.util.*;
public class Jobsechudeling {
	static class job{
		int id;
		int dl;
		int profit;
		job(int id,int dl,int profit){
			this.id=id;
			this.dl=dl;
			this.profit=profit;
		}
	}
	public static int[] jobschdl(int[][] jobs) {
		job jarr[]=new job [jobs.length];
		for(int i=0;i<jobs.length;i++) {
			jarr[i]=new job(jobs[i][0],jobs[i][1],jobs[i][2]);
		}
		Arrays.sort(jarr,(a,b)->b.profit-a.profit);
		int max=0;
		for(int i=0;i<jarr.length;i++) {
			max=Math.max(max,jarr[i].dl);//jarr[i].dl 
		}
		int arr1[]=new int[max+1];
		int jc=0,totprofit=0;
		for(job j:jarr) {
			for(int day=j.dl;day>=1;day--){
				if(arr1[day]==0) {
					arr1[day]=j.id;
					jc+=1;
					totprofit+=j.profit;
					break;
				}
			}
		}
		return new int[] {totprofit,jc};
	}
 public static void main(String[] args) {
	Scanner ah=new Scanner(System.in);
    int n=ah.nextInt();
    int jobs[][]=new int[n][3];
    for(int i=0;i<n;i++) {
    	for(int j=0;j<3;j++) {
    		jobs[i][j]=ah.nextInt();
    	}
    }
    int res[]=jobschdl(jobs);
    System.out.print(Arrays.toString(res));
}
}
