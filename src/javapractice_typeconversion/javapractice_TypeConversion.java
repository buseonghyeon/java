package javapractice_typeconversion;

public class javapractice_TypeConversion {
	
	double a = 3.0F;
	// 오류 발생 - double형이 float형보다 더 많은수 표현 가능
	// float a = 3.0;
	
	int b = 3;
	float c = 1.0F;
	double d = b + c;
	
	// 명시적형변환
	// 오류발생 - 자동 형 변환 이루어 지지 않아서
//	float e = 100.0;
//	int f = 100.0F;
	float e = (float)100.0;
	int f = (int)100.0F;
	
}
