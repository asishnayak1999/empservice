package file2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EmployeeService {
			
			private String employees[] = {"101001011","102001022","103002011","104003080","105002020","106002080"};
			public String[] getEmployeeCodes()
			{
				String codes[] = new String[employees.length];
				int count = -1;
				for (String empid : employees) {
					codes[++count] = empid.substring(0, 3);
				}
				
				return codes;
			}
			public String[] getEmployeeLoc()
			{
				String Locs[] = new String[employees.length];
				int count = -1;
				for (String empid : employees) {
					Locs[++count] = empid.substring(6);
				}
				
				return Locs;
			}
			
			public static void PrintCodeWithLoc(String[] codes,String[] locs) {
				
				for(int i=0;i<locs.length;i++) {
					
					if(locs[i].equals("011"))
						System.out.println(codes[i]+"-"+"delhi");
					else if(locs[i].equals("022"))
						System.out.println(codes[i]+"-"+"Mumbai");
					else if(locs[i].equals("080"))
						System.out.println(codes[i]+"-"+"Bangalore");
					else if(locs[i].equals("020"))
						System.out.println(codes[i]+"-"+"Pune");
				}
				
			}
			public String[] getEmployeeDegs() {
				
				String Degs[] = new String[employees.length];
				int count = -1;
				for (String empid : employees) {
					Degs[++count] = empid.substring(3,6);
				}
				
				return Degs;
			}
			private static void printNumberOfEmpInDept(String[] arr) {
					
					int n = arr.length;
					Map<String, Integer> mp = new HashMap<>();
			        for (int i = 0; i < n; i++)
			        {
			            if (mp.containsKey(arr[i]))
			            {
			                mp.put(arr[i], mp.get(arr[i]) + 1);
			            }
			            else
			            {
			                mp.put(arr[i], 1);
			            }
		        }
		        System.out.println("\n");
		        for (Entry<String, Integer> entry : mp.entrySet())
		        {
		            System.out.println(entry.getKey() + " " + entry.getValue());
		        }
				
			}
			
			public static void main(String[] args) {
							
				EmployeeService service = new EmployeeService();
				String codes[] = service.getEmployeeCodes();
				String Locs[] = service.getEmployeeLoc();
				String Degs[] = service.getEmployeeDegs();
				
				PrintCodeWithLoc(codes,Locs);
				printNumberOfEmpInDept(Degs);
				

			
			}
		}
