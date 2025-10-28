package a_main;
import b_user.User;
import c_test.PoliType;
import c_test.Question;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        User userObj = new User();
        Question questionObj = new Question();

        // 1단계: 사용자 정보 수집
        userObj.collectInfo(scanObj);
        // 2단계: 정치성향 테스트 진행
        userObj.conductSurvey(scanObj, questionObj);
        // 3단계: 정치성향 테스트 값 출력
        PoliType politypeobj = new PoliType();
        politypeobj.calculateResponses(userObj); // 고친점: 매개변수 questionObj 삭제함. 사유: 메서드 안에서 전혀 쓰이지 X
        politypeobj.runSpinner(userObj);
        politypeobj.printResults(); // 이미 위 메서드의 퍼센테지 값들이 필드에 저장되어, 이미 저장된 필드 값을 사용하기 때문에 매개변수 필요 X

    }
} // 괄호 위치



