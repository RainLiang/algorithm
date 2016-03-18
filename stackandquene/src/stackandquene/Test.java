package stackandquene;

public class Test {
	public static void main(String[] args) {
//		Stack stack = new Stack(10);
//		stack.push(23);
//		stack.push(24);
//		stack.push(14);
//		stack.push(6);
//		stack.push(63);
//		stack.push(23);
//		stack.push(24);
//		stack.push(14);
//		stack.push(6);
//		stack.push(63);
//		stack.push(100);
//		System.out.println(stack.peek());  //获取栈顶数据为63
//		while(!stack.isEmpty())
//		{
//			System.out.println(stack.pop());
//		}
//		System.out.println(stack.peek());  //此处会报错，因为栈已经空了
		
		Queue queue = new Queue();
		queue.insert(45);
		queue.insert(24);
		queue.insert(67);
		queue.insert(54);
		queue.insert(52);
		queue.insert(51);
		while(!queue.isEmpty())
		{
			System.out.println(queue.remove());
		}
	}
}
