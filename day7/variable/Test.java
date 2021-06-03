package variable;

public class Test {
	public static void main(String[] args) {
		Company kim = new Company();
		Company han = new Company();
		Company lee = new Company();
		
		kim.myIncome += 3000;
		lee.myIncome += 2000;
		
		Company.income += kim.myIncome;
		Company.income += lee.myIncome;
		
		System.out.println(Company.income);
		
	}
}
