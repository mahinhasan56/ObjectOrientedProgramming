package class3;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class EmployeeOperation {
	Map<Integer, List<Object>> emap = new Hashtable<Integer, List<Object>>();

	List<Object> elist = new ArrayList<Object>();

	public void addEmployee(Employee employee) {
		elist.add(employee.getName());
		elist.add(employee.getSalary());
		elist.add(employee.getLoaction());

		emap.put(employee.getId(), elist);
	}

	public Map<Integer, List<Object>> getAllMap() {
		return emap;
	}

}
