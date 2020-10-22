package chap09.excercise;

public class Chatting {
	void startChar(String chatId) {
		// String nickName = null;
		// nickName = chatId; // 이렇게 값 변경 불가
		String nickName = chatId; // 수정
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData; // 익명 함수 객체에서 사용한 매개변수, 로컬 변수는 final
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
	
}
