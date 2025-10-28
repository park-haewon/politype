package b_user;
import c_test.Question;

import java.awt.*;
import java.util.Scanner;
import c_test.ColorUtils;

public class User {
    // 필드 선언 or 인스턴스 변수 선언
    public int age; // 기본값: 0
    int selection;
    public String name; // 기본값: null (객체/문자열.. 주소가 없다는 뜻)
    public String gender;
    public int[] responses; // 내 응답들 저장하기

    public User(){
        responses = new int[48];
        // 배열 제외하고 다른 값들은 사용자로부터 입력을 받으니 초기값을 생성자에다가 선언하면 됨.
        // 언제 생성자에서 초기화할까?
        // 필요한 경우: (1) 배열/객체 (공간을 만들어야 함) (2) 기본값이 필요한 경우
        // 안해도 되는 경우: (1) 사용자 입력으로 채울 변수들 (2) 나중에 메서드에서 값 설정할 변수들
    }

    // Method 0: Typewriter (타이핑 효과)
    public void typeWriter(String text, int delay){
        try{
            for (int i = 0; i < text.length(); i++){
                System.out.print(text.charAt(i)); // 문제: println 을 썼었음. 한 단어씩 출력됐음.
                Thread.sleep(delay);
            }
        } catch (InterruptedException error) {
            System.out.println("에러가 났습니다.");
        }
    }

    // Method 1: collectInfo (사용자 정보 수집 및 인트로)
    public void collectInfo(Scanner scan) {
        try {

            // Introduction
            System.out.println(ColorUtils.rainbow("\n" +
                    "█▀█ █▀█ █░░ █ ▀█▀ █▄█ █▀█ █▀▀ ▀  \n" +
                    "█▀▀ █▄█ █▄▄ █ ░█░ ░█░ █▀▀ ██▄ ▄  \n" +
                    "\n" +
                    "█▄█ █▀█ █░█ █▀█   █▀█ █▀█ █░░ █ ▀█▀ █ █▀▀ █▀ ░   █▀▄▀█ █▀█ █▀█ ▄▀█ █░░ █░░ █▄█   █▀▀ ▀▄▀ █▀█ █░░ ▄▀█ █ █▄░█ █▀▀ █▀▄ ░\n" +
                    "░█░ █▄█ █▄█ █▀▄   █▀▀ █▄█ █▄▄ █ ░█░ █ █▄▄ ▄█ █   █░▀░█ █▄█ █▀▄ █▀█ █▄▄ █▄▄ ░█░   ██▄ █░█ █▀▀ █▄▄ █▀█ █ █░▀█ ██▄ █▄▀ ▄"));
            Thread.sleep(1500);


            typeWriter(ColorUtils.rainbow("\nPOLITYPE") + ColorUtils.intro("에 오신 것을 환영합니다."), 50);
            typeWriter(ColorUtils.intro("\n이 테스트는 단순한 정치 성향 테스트가 아닙니다."), 50);
            typeWriter(ColorUtils.intro("\n당신의 정치적 성향을 알아보고, 어떠한 도덕적인 기준이 성향을 만드는지, 그리고 그 성향에 따라 상대방을 이해하는 여정입니다."), 50);
            typeWriter(ColorUtils.intro("\n어떤 가치가 당신의 신념을 이끄는지, 그리고 왜 타인의 생각은 다르게 느껴지는지 이해해보세요."), 50);
            typeWriter(ColorUtils.intro("\n지금, 당신만의") + ColorUtils.rainbow(" POLITYPE") + ColorUtils.intro("을 찾아가는 여정을 시작합니다."), 50);

            System.out.println("");
            System.out.println(ColorUtils.intro("\n※ 본 테스트는 웨이브 오리지널 [사상검증구역: 더 커뮤니티]의 프로그램내에서 활용하기 위해 제작된 척도로, 측정값이 응답자의 정치사회 견해와 일부 일치하지 않을 수 있습니다."));
            System.out.println(ColorUtils.intro("※ 테스트의 질문들은 연세대학교 사회과학대학 김용찬 교수의 자문을 거쳐 작성되었으며, 리서치 업체 '엠브레인'을 통해 신뢰도 조사를 완료했습니다."));
            System.out.println(ColorUtils.intro("※ 실제로 존재하는 여러 사회적 입장에 대한 응답자의 '동의 여부'를 확인하는 것이므로, 일부 차별적이거나 과격하다고 느껴지는 문항이 있는 점을 참고하여 주시기 바랍니다."));
            // 이 중간에 여정을 시작하게끔 보여주는 애니메이션 효과. 아스키 아트 넣으면 좋을듯.

            // Introduction: 프로필 설정
            typeWriter(ColorUtils.intro("\n시작에 앞서, 간단한 정보를 통해 프로필을 설정하겠습니다"), 50);

            typeWriter(ColorUtils.intro("\n첫 번째 질문.") + ColorUtils.intro(" 당신의 이름은 무엇인가요?\n"), 50);
            this.name = ColorUtils.rainbow(scan.nextLine());

            typeWriter(ColorUtils.intro("만나서 반갑습니다 " + name + "님!\n"), 50);
            typeWriter(ColorUtils.intro("\n두 번째 질문.") + ColorUtils.intro(" 당신은 몇살이신가요?\n"), 50);
            this.age = scan.nextInt();

            typeWriter(ColorUtils.intro("\n마지막 질문.") + ColorUtils.intro(" 당신의 성별은 무엇인가요?\n"), 50);
            this.gender = ColorUtils.rainbow(scan.nextLine());
            scan.nextLine(); //nextInt()는 숫자만 읽고 엔터는 남겨둠. nextLine()은 엔터까지 읽는다.

            typeWriter(ColorUtils.intro("\n답변 감사드립니다!"), 50);
        } catch (InterruptedException error) {
            System.out.println(ColorUtils.intro("게임 시작 중 오류가 발생했습니다!"));
    }
    }

    // Method 2: conductSurvey (사용자에게 질문 보여주고 응답을 받아 responses 배열 저장)
    public void conductSurvey(Scanner scanObj, Question questionObj){
        try {
            typeWriter(ColorUtils.intro("\n그럼 지금부터 본격적인") + ColorUtils.rainbow(" POLITYPE ") + ColorUtils.intro("테스트를 진행하겠습니다."), 60);
            typeWriter(ColorUtils.intro("\n테스트의 문항은 총 ") + ColorUtils.rainbow("50") + ColorUtils.intro("개이며"), 60);
            typeWriter(ColorUtils.intro("\n아래 문항에 대해 본인의 선호도를 1부터 6까지의 숫자로 선택해 주세요."), 60);
            System.out.println("");

            for (int i = 0; i < questionObj.getTotalQuestions(); i++){
                String question = questionObj.getQuestion(i);
                typeWriter(question, 50);
                System.out.println(ColorUtils.red("\n1.")+ ColorUtils.intro("매우 반대 ") + ColorUtils.yellow(" 2.") + ColorUtils.intro("반대 ") +  ColorUtils.green(" 3.") + ColorUtils.intro("약간 반대 ") +
                        ColorUtils.cyan(" 4.") + ColorUtils.intro("약간 동의 ") + ColorUtils.blue(" 5.") + ColorUtils.intro("동의 ") + ColorUtils.purple(" 6.") + ColorUtils.intro("매우 동의 "));


                // 문제: 1-6 사이의 숫자를 입력하지 않았을 때 에러 오류 잡기 (do while문 사용)
                // 1. 입력받기 -> 2. 잘못되었나 확인 -> 3. 잘못되었으면 오류 메세지 출력 -> 4. 여전히 잘못되었으면 1번으로 다시, 올바르면 종료
                // while vs. do while (일단 최소 1번은 무조건 실행해야함)
                int responses; // 한번 입력받는 거니까 지역변수로 잡기
                do {
                    responses = scanObj.nextInt();
                    if (responses < 1 || responses > 6) {
                        System.out.println(ColorUtils.intro("잘못된 입력입니다. 1~6 사이의 숫자를 입력해주세요."));
                    }
                } while (responses < 1 || responses > 6); // 조건이 거짓이 되어야 반복문이 끝남.

                this.responses[i] = responses;
            }

        } catch (Exception error) {
            System.out.println("에러가 발생했습니다: " + error.getMessage());
        }
    }


    // Method 3: getSurveyresponse (사용자가 입력한 설문조사의 배열값을 반환하는 메서드)
    public int[] getSurveyresponse(){
        return this.responses;

        // 여기서 생긴 오류: 리턴 타입을 서로 맞추지 않았음.
        // 배열의 변수타입은 int[] 라고 해주면 됨. 이미 위 conductSurvey에서 입력을 받고 저장을 했기 때문에 매개변수로 선언하지 않아도 됨.

    // Method 4: runSpinner


}
}
