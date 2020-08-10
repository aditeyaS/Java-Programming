class FCFS {
  public static void main(String[] args) {
    int process_list[] = {1, 2, 3}; 
    int n = process_list.length;   
    int burst_time[] = {11, 3, 6}; 
    int wt[] = new int[n];
    int tat[] = new int[n]; 
    //waiting_time
    wt[0] = 0; 
    for (int i = 1; i < n; i++) { 
      wt[i] = burst_time[i - 1] + wt[i - 1]; 
    } 
    //turn_around_time
    for (int i = 0; i < n; i++) { 
      tat[i] = burst_time[i] + wt[i]; 
    } 
    System.out.println("P\tBT\tWT\tTAT");
    int total_wt = 0, total_tat = 0; 
    for (int i = 0; i < n; i++) { 
      total_wt += wt[i]; 
      total_tat += tat[i];
      System.out.println(process_list[i]+"\t"+burst_time[i]+"\t"+wt[i]+"\t"+tat[i]);
    } 
    float s = (float)total_wt /(float) n; 
    int t = total_tat / n; 
    System.out.println("Average waiting time = " + s); 
    System.out.println("Average turn around time = " + t); 
  }
}
