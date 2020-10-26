package chap13.wildCards;

public class GenericEx3Wildcard {
	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<>("일반인", 5);
		Course<Student> courseStudent = new Course<>("학생", 5);
		
		
		Person p = new Person("일반");
		Student s = new Student("학생");
		
		p = s; // 부모 = 자식 관계 성립
		
		courseStudent.add(new Student("hong"));
		coursePerson.add(new Person("kim"));
		coursePerson.add(new Student("choi"));
		
//		coursePerson = courseStudent; // cPerson이 cStudent 객체 가리킴
		coursePerson.add(new Person("lee")); // 지금 coursePerson은 courseStudent 가리키고 있음. 상위 타입인 new Person() 할 수 XXX
		// -> coursePerson이 courseStudent의 부모가 아니라는 얘기! -> 와일드 카드 필요,,
		
		
		System.out.println("wildcard");
		Course<? super Student> courseW0 = new Course<Object>("a", 1);
		Course<? super Student> courseW1 = new Course<Person>("a", 1); // Student 상위 클래스 받기
		Course<? super Student> courseW2 = new Course<Student>("a", 1); 
		// Course<? super Student> courseW3 = new Course<HighStudent>("a", 1); // 하위 타입 XXX
		
		// Student 하위 클래스를 new 할 수 ㅇ -> why? 우항에는 타입으로 Object, Person, Student를 받을 수 ㅇ, 그 어떤 값이 오든 
		// 해당 타입의 하위 클래스를 new 할 수 있으니까
		// =>> add는 wildCard로 상위 클래스 제한해서 객체 생성
		courseW0.add(new HighStudent("a"));
		courseW0.add(new Student("a"));
		// courseW0.add(new Object()); // 이건 안 돼
		// courseW0.add(new Person("park"));
		Course<Object> co = (Course<Object>) courseW0; // 강제로 캐스팅
		co.add(new Object()); // 이건 돼
		
		courseW1.add(new Student("a")); // 이게 가능
		courseW2.add(new Student("a"));
		
		
		
		
		
		Course<? extends Student> courseE1 = new Course<>("a", 5); // 하위 클래스
		Course<? extends Student> courseE2 = new Course<HighStudent>("a", 5);
		
		// Student 타입의 하위 클래스 객체 생성 가능.
		// Student, HighStudent 모두 Student 타입으로 get 할 수 있음
		// get은 extends로!
		Student st1 = courseE1.getStudents()[0];
		
		Course<?> courseA1 = new Course<Person>("a", 5);
		Course<?> courseA2 = new Course<Worker>("a", 5);
		Course<?> courseA3 = new Course<Student>("a", 5);
		Course<?> courseA4 = new Course<HighStudent>("a", 5);
		
		
	}
}
