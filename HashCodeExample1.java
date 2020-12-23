class HashCodeExample1 {
	public static void main(String[] args) {
		String obj1 = new String("헤르미온느");
		String obj2 = new String("헤르미온느");
		if (obj1 == obj2)
			System.out.println("같다");
		else
			System.out.println("다르다");
		int hash1 = obj1.hashCode();
		int hash2 = obj2.hashCode();
		System.out.println(hash1);
		System.out.println(hash2);

	} // 오브젝트 클래스에 있는 hashCode()는 생성된 객체주소를 이용 해서
	// 계산하기 때문에 객체의 주소가 다르면 다른 hashCode() 값을 만들어 낸다.
	// 스트링 클래스의 hashCode()는 동일한 문자열 데이터를 가지면 동일한
	// hashCode()가 계산되도록 오버라이딩 되어 제공된다.
	

}
