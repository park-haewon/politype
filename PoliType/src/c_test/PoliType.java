package c_test;
import b_user.User;
import c_test.ColorUtils;

import java.awt.*;

public class PoliType {
    // 필드 선언: 어떤 데이터를 가질까?
    int economic_Score; // 정수니까 기본값 0으로 자동 초기화 됨.
    int societal_Score;
    int authority_Score;
    int gender_Score;

    int economic_percentage; // 지역 변수로 선언하게 되면 다른 클래스에서 접근 못함. 추후에 활용을 위해 클래스 필드로 선언.
    int societal_percentage;
    int authority_percentage;
    int gender_percentage;

    int[] economic_Questions = {0, 1, 4, 7, 17, 25, 26, 27, 37, 41, 44, 45}; // 경제관 12개
    int[] societal_Questions = {2, 5, 6, 9, 10, 15, 22, 23, 30, 33, 34, 40}; // 사회문화관 12개
    int[] authority_Questions = {8, 12, 13, 18, 19, 20, 24, 38, 39, 42, 46, 47}; // 권위관 12개
    int[] gender_Questions = {3, 11, 14, 16, 21, 28, 29, 31, 32, 35, 36, 43}; // 젠더관 12개

    String PoliticalType;

    // Method 0: 생성자 만들기 (객체 만들 때 어떻게 초기화를 할까?)
    public PoliType() {
    }

    // 추가 메서드: typeWriter
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

    // Method 1: calculateResponses 반환된 설문답변을 연결시켜 계산하는 메서드 (객체가 어떤 일을 할까?)
    public void calculateResponses(User userObj) { // '메서드 정의'와 '메서드 호출'의 매개변수가 정확하게 일치해야함

        // 고민 1: 이미 User 클래스에 값들을 저장한 변수가 있는데 이걸 직접 사용하지,
        // 왜 따로 User 클래스에 반환하는 메서드를 만들어서 또 다시 변수 저장을 해야하는 것인가?
        // -> 보안 법칙: 다른 클래스의 내부 데이터를 직접 건드리면 안된다. public으로 직접 접근이 가능하더라도 get메서드를 쓰는게 좋은 습관.

        // 고민 2: 질문 번호들이 일정하지 않은데 이걸 반복문으로 어떻게 쓰지?
        // -> 질문 번호는 불규칙하지만, 배열 인덱스는 규칙적이다. 배열 안에 순서대로 담겼기 때문에 하나씩 꺼내 쓸 수 있다.

        int[] Question_responses = userObj.getSurveyresponse();

        // Method 1-1: Economic 경제관
        for (int i = 0; i < economic_Questions.length; i++) {
            int questionNumber = economic_Questions[i];
            int userAnswer = Question_responses[questionNumber]; // 고민 3: 배열의 질문 번호와 배열의 질문 답변을 연결 시키는 과정. (userName  지역변수)

            if (questionNumber == 0 || questionNumber == 4 || questionNumber == 27 || questionNumber == 37 || questionNumber == 45) {
                userAnswer = 7 - userAnswer; // Ternary Operator을 통해.. 기준 세움
            }

            if (userAnswer == 1) {
                economic_Score += -3;
            } else if (userAnswer == 2) {
                economic_Score += -2;
            } else if (userAnswer == 3) {
                economic_Score += -1;
            } else if (userAnswer == 4) {
                economic_Score += 1;
            } else if (userAnswer == 5) {
                economic_Score += 2;
            } else if (userAnswer == 6) {
                economic_Score += 3;
            }
        }

        // Method 1-2: Society 사회관
        for (int i = 0; i < societal_Questions.length; i++) {
            int questionNumber = societal_Questions[i];
            int userAnswer = Question_responses[questionNumber];

            if (questionNumber == 5 || questionNumber == 9 || questionNumber == 22 || questionNumber == 34) {
                userAnswer = 7 - userAnswer;
            }

            if (userAnswer == 1) {
                societal_Score += -3;
            } else if (userAnswer == 2) {
                societal_Score += -2;
            } else if (userAnswer == 3) {
                societal_Score += -1;
            } else if (userAnswer == 4) {
                societal_Score += 1;
            } else if (userAnswer == 5) {
                societal_Score += 2;
            } else if (userAnswer == 6) {
                societal_Score += 3;
            }
        }

        // Method 1-3: Authority 권위관
        for (int i = 0; i < authority_Questions.length; i++) {
            int questionNumber = authority_Questions[i];
            int userAnswer = Question_responses[questionNumber];

            if (questionNumber == 20 || questionNumber ==46){
                userAnswer = 7 - userAnswer;
            }

            if (userAnswer == 1) {
                authority_Score += -3;
            } else if (userAnswer == 2) {
                authority_Score += -2;
            } else if (userAnswer == 3) {
                authority_Score += -1;
            } else if (userAnswer == 4) {
                authority_Score += 1;
            } else if (userAnswer == 5) {
                authority_Score += 2;
            } else if (userAnswer == 6) {
                authority_Score += 3;
            }
        }

        // Method 1-4: Gender 젠더관
        for (int i = 0; i < gender_Questions.length; i++) {
            int questionNumber = gender_Questions[i];
            int userAnswer = Question_responses[questionNumber];

            if (questionNumber == 3 || questionNumber == 14 || questionNumber == 16 || questionNumber == 21 || questionNumber == 28 || questionNumber == 29 || questionNumber == 31 || questionNumber == 32 || questionNumber == 35 || questionNumber == 36 || questionNumber == 43) {
                userAnswer = 7 - userAnswer;
            }

            if (userAnswer == 1) {
                gender_Score += -3;
            } else if (userAnswer == 2) {
                gender_Score += -2;
            } else if (userAnswer == 3) {
                gender_Score += -1;
            } else if (userAnswer == 4) {
                gender_Score += 1;
            } else if (userAnswer == 5) {
                gender_Score += 2;
            } else if (userAnswer == 6) {
                gender_Score += 3;
            }
        }
        // Math.round()  입력: double or float. 출력: long (정수)
        economic_percentage = (int) Math.round((economic_Score + 36) / 72.0 * 100); // 실수 나눗셈 위해 72.0
        societal_percentage = (int) Math.round((societal_Score + 36) / 72.0 * 100);
        authority_percentage = (int) Math.round((authority_Score + 36) / 72.0 * 100);
        gender_percentage = (int) Math.round((gender_Score + 36) / 72.0 * 100); // 고민: 반올림을 하고 싶음!

    }

    // Methods 2: Main에 출력 위한 퍼센티지 값 반환하는 메서드들
    public int getEconomic_percentage() {
        return economic_percentage;
    }

    public int getSocietal_percentage() {
        return societal_percentage;
    }

    public int getAuthority_percentage() {
        return authority_percentage;
    }

    public int getGender_percentage() {
        return gender_percentage;
    }

    // Method 3: printResults 결과값 포맷에 맞춰서 출력하는 메서드
    public void printResults() {
        try {


            System.out.println(ColorUtils.rainbow("\n" +
                    "█▀█ █▀█ █░░ █ ▀█▀ █▄█ █▀█ █▀▀   █▀█ █▀▀ █▀ █░█ █░░ ▀█▀\n" +
                    "█▀▀ █▄█ █▄▄ █ ░█░ ░█░ █▀▀ ██▄   █▀▄ ██▄ ▄█ █▄█ █▄▄ ░█░\n"));
            System.out.println(ColorUtils.intro("🎯 당신의 POLITYPE이 완성되었습니다! 🎯"));

            System.out.println("경제관: " + economic_percentage + "%\n" + "E " + createBar(economic_percentage) + "R");
            System.out.println("사회관: " + societal_percentage + "%\n" + "P " + createBar(societal_percentage) + "C");
            System.out.println("권위관: " + authority_percentage + "%\n" + "L " + createBar(authority_percentage) + "A");
            System.out.println("젠더관: " + gender_percentage + "%\n" + "F " + createBar(gender_percentage) + "E");

            String firstType = (economic_percentage >= 50) ? "R" : "E"; // 문제: 어떤 퍼센티지가 E고 어떤게 R인지의 기준이 명확하지 않음. 기준을 문제 계산하는 부분에서 세워주자.
            String secondType = (societal_percentage >= 50) ? "C" : "P";
            String thirdType = (authority_percentage >= 50) ? "A" : "L";
            String fourthType = (gender_percentage >= 50) ? "E" : "F";

            System.out.println(ColorUtils.intro(" 당신은 " + firstType + secondType + thirdType + fourthType + " 입니다!"));
            System.out.println("");
            String politicalType = firstType + secondType + thirdType + fourthType;
            // 문제: 필드에서 선언시 오류남.
            // 1. 초기화 순서 문제: 클래스 로딩 시점에 다른 필드들이 준비 안됨  2. 의존성 문제: firstType이 economic_percentage에 의존하는데, 그 값은 calculateReponses() 에서 결정됨.
            // -> 필드 선언만 하고 메서드에서 값 할당하기  "값이 확정된 후에 타입을 결정해야한다!"

            // 문제: 문자열에 있는 값을 비교하려고 == 을 쓰니까 오류가 남.
            // == 연산자는 객체의 주소를 비교하여 일치하는지 확인, equals() 메서드는 객체의 내용을 비교하여 같은지 확인.
            if (politicalType.equals("RCAE")) {
                typeWriter(ColorUtils.intro("💼 당신은 시장보수 권위형! 💼\n" +
                        "자유시장 경제를 신봉하며 전통적 가치를 중시합니다.\n" +
                        "질서와 안정을 선호하고, 성별에 따른 역할 분담이 자연스럽다고 봅니다.\n" +
                        "강력한 리더십과 사회 통제를 통해 발전할 수 있다고 믿습니다.\n" +
                        "비슷한 성향: 레이건(미국), 대처(영국), 박정희"), 50);

            } else if (politicalType.equals("RCAF")) {
                typeWriter(ColorUtils.intro("👨‍💼 당신은 시장보수 페미형! 👨‍\n" +
                        "자유시장을 지지하면서도 여성의 권익 신장을 중요하게 생각합니다.\n" +
                        "전통적 가치를 존중하지만 성평등 문제에는 적극적입니다.\n" +
                        "질서 있는 사회에서 여성의 역할 확대를 추구합니다.\n" +
                        "비슷한 성향: 콘돌리자 라이스(미국), 박근혜, 이바나 트럼프"), 50);

            } else if (politicalType.equals("RCLE")) {
                typeWriter(ColorUtils.intro("🏛️ 당신은 시장보수 자유형! 🏛️\n" +
                        "경제적 자유와 개인의 자유를 모두 중시하는 고전적 자유주의자입니다.\n" +
                        "시장의 힘을 믿으면서도 개인의 권리와 표현의 자유를 옹호합니다.\n" +
                        "전통을 존중하되 개인의 선택권을 보장해야 한다고 봅니다.\n" +
                        "비슷한 성향: 론 폴(미국), 하이에크(학자), 유승민"), 50);

            } else if (politicalType.equals("RCLF")) {
                typeWriter(ColorUtils.intro("💪 당신은 시장보수 여권형 💪\n" +
                        "자유시장 경제를 지지하면서 여성 권익에 관심이 높습니다.\n" +
                        "전통적 가치는 유지하되 여성의 사회적 지위 향상을 추구합니다.\n" +
                        "개인의 자유와 여성의 권리를 동시에 중시하는 균형잡힌 관점을 가집니다.\n" +
                        "비슷한 성향: 사라 페일린(미국), 나경원, 김현미"), 50);

            } else if (politicalType.equals("RPAE")) {
                typeWriter("🚀 당신은 시장진보 권위형 🚀\n" +
                        "시장경제의 효율성을 믿으면서도 사회 변화를 추구합니다.\n" +
                        "진보적 가치를 지향하되 강력한 리더십이 필요하다고 봅니다.\n" +
                        "혁신과 질서가 조화를 이뤄야 한다고 생각하는 실용주의자입니다.\n" +
                        "비슷한 성향: 토니 블레어(영국), 클린턴(미국), 안철수", 50);

            } else if (politicalType.equals("RPAF")) {
                typeWriter(ColorUtils.intro("🌟 당신은 시장진보 페미형! 🌟\n" +
                        "자유시장의 역동성과 여성 권익 모두를 중시합니다.\n" +
                        "사회 변화를 추구하면서 여성의 경제적 참여 확대를 지지합니다.\n" +
                        "강력한 리더십으로 성평등 사회를 이끌어가고자 합니다.\n" +
                        "비슷한 성향: 힐러리 클린턴(미국), 메르켈(독일), 박영선"), 50);

            } else if (politicalType.equals("RPLE")) {
                typeWriter(ColorUtils.intro("🌈 당신은 시장진보 자유형! 🌈\n" +
                        "경제적 자유와 사회적 자유를 모두 추구하는 자유주의자입니다.\n" +
                        "시장의 혁신과 개인의 다양성을 동시에 중시합니다.\n" +
                        "변화하는 세상에 맞춰 개인의 선택권을 최대한 보장하려 합니다.\n" +
                        "비슷한 성향: 게리 존슨(미국), 마크롱(프랑스), 정동영"), 50);

            } else if (politicalType.equals("RPLF")) {
                typeWriter(ColorUtils.intro("✨ 당신은 시장진보 여권형! ✨\n" +
                        "자유시장과 여성 권익, 개인의 자유를 모두 중시합니다.\n" +
                        "진보적 가치와 경제적 자유가 조화를 이뤄야 한다고 봅니다.\n" +
                        "다양성과 혁신을 통해 모든 개인이 빛날 수 있는 사회를 꿈꿉니다.\n" +
                        "비슷한 성향: 알렉산드리아 오카시오-코르테스(미국), 김어준, 장혜영"), 50);

            } else if (politicalType.equals("ECAE")) {
                typeWriter(ColorUtils.intro("⚖️ 당신은 평등보수 권위형! ⚖️\n" +
                        "경제적 평등을 추구하면서 전통적 가치를 중시합니다.\n" +
                        "사회 안정과 질서를 통해 모든 사람이 공정한 기회를 얻어야 한다고 봅니다.\n" +
                        "강력한 정부가 불평등을 해소해야 한다고 믿는 권위적 평등주의자입니다.\n" +
                        "비슷한 성향: 푸틴(러시아), 시진핑(중국), 김대중"), 50);

            } else if (politicalType.equals("ECAF")) {
                typeWriter(ColorUtils.intro("👩‍⚖️ 당신은 평등보수 페미형 👩‍\n" +
                        "경제적 평등과 여성 권익을 동시에 추구합니다.\n" +
                        "전통적 가치는 유지하되 여성의 경제적 지위 향상을 중시합니다.\n" +
                        "체계적인 접근으로 성별 격차 해소와 사회 안정을 도모합니다.\n" +
                        "비슷한 성향: 에바 페론(아르헨티나), 추미애, 정세균"), 50);

            } else if (politicalType.equals("ECLE")) {
                typeWriter(ColorUtils.intro("🕊️ 당신은 평등보수 자유형! 🕊\n" +
                        "경제적 평등과 개인의 자유를 균형있게 추구합니다.\n" +
                        "전통적 가치를 존중하면서도 개인의 권리를 보장하려 합니다.\n" +
                        "온건한 방식으로 사회 불평등을 해소하고자 하는 중도적 성향입니다.\n" +
                        "비슷한 성향: 오바마(미국), 문재인, 김부겸"), 50);

            } else if (politicalType.equals("ECLF")) {
                typeWriter(ColorUtils.intro("🌸 당신은 평등보수 여권형! 🌸\n" +
                        "경제적 평등과 여성 권익을 중시하면서 개인의 자유도 보장하려 합니다.\n" +
                        "전통적 가치 안에서 성평등을 실현하고자 하는 온건파입니다.\n" +
                        "점진적이고 평화로운 방식으로 사회 변화를 추구합니다.\n" +
                        "비슷한 성향: 미셸 오바마(미국), 유은혜, 김상희"), 50);

            } else if (politicalType.equals("EPAE")) {
                typeWriter(ColorUtils.intro("🔥 당신은 평등진보 권위형! 🔥\n" +
                        "경제적 평등과 사회 변화를 강력하게 추진하려는 혁명가적 성향입니다.\n" +
                        "진보적 가치 실현을 위해 강력한 정부 개입이 필요하다고 봅니다.\n" +
                        "사회 구조적 변화를 통해 진정한 평등사회를 만들고자 합니다.\n" +
                        "비슷한 성향: 차베스(베네수엘라), 모랄레스(볼리비아), 노회찬"), 50);

            } else if (politicalType.equals("EPAF")) {
                typeWriter(ColorUtils.intro("💜 당신은 평등진보 페미형! 💜\n" +
                        "경제적 평등, 사회 진보, 여성 권익을 모두 추구하는 진보 페미니스트입니다.\n" +
                        "구조적 불평등 해소를 위해 적극적인 정부 정책이 필요하다고 봅니다.\n" +
                        "체계적이고 강력한 방식으로 성평등 사회를 실현하고자 합니다.\n" +
                        "비슷한 성향: 엘리자베스 워런(미국), 심상정, 류호정"), 50);

            } else if (politicalType.equals("EPLE")) {
                typeWriter(ColorUtils.intro("🌻 당신은 평등진보 자유형! 🌻\n" +
                        "경제적 평등과 개인의 자유, 사회 진보를 모두 중시하는 이상주의자입니다.\n" +
                        "다양성과 포용성을 바탕으로 한 평등한 사회를 꿈꿉니다.\n" +
                        "개인의 자율성을 보장하면서도 사회적 연대를 추구하는 균형잡힌 관점을 가집니다.\n" +
                        "비슷한 성향: 샌더스(미국), 코빈(영국), 이재명"), 50);

            } else if (politicalType.equals("EPLF")) {
                typeWriter(ColorUtils.intro("🦋 당신은 평등진보 여권형! 🦋\n" +
                        "모든 가치를 조화롭게 추구하는 포용적 진보주의자입니다.\n" +
                        "경제적 평등, 사회 진보, 개인의 자유, 여성 권익을 모두 중시합니다.\n" +
                        "다원적이고 포용적인 방식으로 모든 사람이 행복한 사회를 만들고자 합니다.\n" +
                        "비슷한 성향: 재신다 아던(뉴질랜드), 노르웨이 총리들, 정의당 리더들"), 50);
            }
        } catch (Exception e) {
            System.out.println("에러가 났습니다.");
        }
    }

    // method 4: 바 그래프 만들기
    public String createBar(int percentage){
        // percentage는 이 메서드 안에서만 사용 가능한 새로운 지역변수.
        String bar = ColorUtils.intro("[");
        int filled = percentage / 5;  // 100%를 20칸으로 나누기!

        for (int i = 0; i < 20; i++) {
            if (i < filled) {
                bar += ColorUtils.rainbow("█");
            } else {
                bar += ColorUtils.rainbow("░");
            }
        }
        bar += ColorUtils.intro("]");
        return bar;

    }

    // method 5. Spinner 만들기
    public void runSpinner(User user){
        try{
            char[] spinner = {'|', '/', '-', '\\'};
            for (int i = 0; i < 15; i++){
                System.out.print(ColorUtils.intro("\r" + user.name+ "님의 정치성향 분석 중... ") + spinner[i % 4]);
                Thread.sleep(200);
            }
            System.out.print(ColorUtils.intro("\r" + user.name + "님의 정치 분석이 완료 되었습니다!"));
        } catch (InterruptedException e) {
            System.out.println(ColorUtils.intro("분석 중 오류가 발생했습니다."));
        }
    }
}
