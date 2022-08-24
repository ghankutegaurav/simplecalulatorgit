package org.example.operations;

	public class Operations {
		private float num1;
		private float num2;
		
		public Operations() {
			// TODO Auto-generated constructor stub
			num1=0.0f;
			num2=0.0f;
		}

		public Operations(float num1, float num2) {
			//super();
			this.num1 = num1;
			this.num2 = num2;
		}

		public float getNum1() {
			return num1;
		}

		public void setNum1(float num1) {
			this.num1 = num1;
		}

		public float getNum2() {
			return num2;
		}

		public void setNum2(float num2) {
			this.num2 = num2;
		}
		
		//methods
		public float add(float a,float b) {
			return (a+b);
		}
		
		public float subtract(float a,float b) {
			return (a-b);
		}
		
		public float multiply(float a, float b) {
			return (a*b);
		}
		
		public float divide(float a, float b) {
			return (a/b);
		}
}


