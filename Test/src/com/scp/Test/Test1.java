package com.scp.Test;

public class Test1  {
			int eId;
			String eName;
			double eSalary;
			public Test1(int eId, String eName, double eSalary) {
				super();
				this.eId = eId;
				this.eName = eName;
				this.eSalary = eSalary;
			}
			/* (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "\nTest1 [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + "]";
			}
			
			
}
