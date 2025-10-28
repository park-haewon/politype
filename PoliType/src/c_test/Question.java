package c_test;

public class Question {
    String[] questions;
    int totalQuestions = 48;

    public Question(){ // 생성자 (메소드)
        questions = new String[totalQuestions];
        // String 배열 객체 생성: 24개의 문자열을 저장할 수 있는 새로운 배열을 만들어서 questions 변수에 저장

        questions[0] = ColorUtils.question("1. 기업이 정부보다 더 큰 해악을 끼칠 가능성이 높다.");
        questions[1] = ColorUtils.question("2. 빈곤의 책임은 기본적으로 본인에게 있다.");
        questions[2] = ColorUtils.question("3. 돈이 많은 사람들은 병의 경중과 상관없이 더 좋은 의료 서비스에 더 쉽게 접근할 수 있어야한다.");
        questions[3] = ColorUtils.question("4. 여성 모델이 속옷이나 수영복을 입고 찍는 섹시화보는 그동안 성취해 온 여성인권을 후퇴시킨다.");
        questions[4] = ColorUtils.question("5. 정부는 CEO들의 임금에 상한선을 정해야 한다.");
        questions[5] = ColorUtils.question("6. 조선족이 범죄를 저지를 확률이 높다고 느끼는 것은 편견에 사로잡힌 잘못된 생각이다.");
        questions[6] = ColorUtils.question("7. PC주의자들의 주장이 선을 넘는 경우가 많다.");
        questions[7] = ColorUtils.question("8. 정부가 민간사업에 개입하면 대부분 망친다고 봐야한다.");
        questions[8] = ColorUtils.question("9. '절이 싫으면 중이 떠나야지'라는 말은 대부분의 경우 옳다.");
        questions[9] = ColorUtils.question("10. 대중매체에 긍정적인 성소수자 캐릭터가 자주 등장하는 것은 소수자 가시화를 위한 좋은 방법이다.");
        questions[10] = ColorUtils.question("11. 디즈니는 인어공주 실사영화에 흑인을 캐스팅함으로써 원작의 추억을 간직한 팬들을 배신했다.");
        questions[11] = ColorUtils.question("12. 오늘날 한국 사회에서 여자로 산다는 것은 남자로 사는 것보다 더 편한 점이 많다.");
        questions[12] = ColorUtils.question("13. 숨길 것이 없는 떳떳한 사람에게는 정부의 감시가 오히려 그를 보호해주는 수단이 된다.");
        questions[13] = ColorUtils.question("14. 내가 혜택을 받지 않는 공공 사업에 대해서는 세금을 납부하지 않아야 한다.");
        questions[14] = ColorUtils.question("15. 세계의 역사를 여성들이 지배했다면 폭력과 전쟁은 훨씬 적었을 것이다.");
        questions[15] = ColorUtils.question("16. 세상이 확실히 더 안 좋은 방향으로 변하고 있다.");
        questions[16] = ColorUtils.question("17. 정부는 기업 임원 등 남성 중심의 고소득 직종에 대한 여성 할당제를 시행해야 한다.");
        questions[17] = ColorUtils.question("18. 자유시장에 맡기는 게 정부정책을 세우는 것보다 낫다.");
        questions[18] = ColorUtils.question("19. 팀워크를 위해서는 내키지 않더라도 회식에 다같이 참여해야한다.");
        questions[19] = ColorUtils.question("20. 장애인들이 바쁜 출퇴근 시간에까지 피해를 끼치며 시위하는 것은 동의할 수 없다.");
        questions[20] = ColorUtils.question("21. 독재 정부에 대한 저항일지라도 폭력은 용인되어서는 안 된다.");
        questions[21] = ColorUtils.question("22. 여성들이 보건휴가(생리휴가)를 주말에 붙여 쓰는 것은 정당한 권리행사이므로 비난할 수 없다.");
        questions[22] = ColorUtils.question("23. 무슬림이 많은 지역이라면 이슬람 율법에 따른 할랄 음식 인증제를 지자체가 지원해 줄 필요가 있다.");
        questions[23] = ColorUtils.question("24. 한국 사회에 온 이주민은 우리 문화에 동화시키는 것이 좋다.");
        questions[24] = ColorUtils.question("25. 의무를 먼저 잘 이행할 때 권리를 주장할 자격도 주어진다.");
        questions[25] = ColorUtils.question("26. 나는 모든 사람들이 비슷한 월급을 받게 하는 나라에서는 살고 싶지 않다.");
        questions[26] = ColorUtils.question("27. 경제 성장 우선 정책이 복지 우선 정책보다 빈곤 탈출에 더 큰 기여를 할 것이다.");
        questions[27] = ColorUtils.question("28. 고액의 사교육은 규제되어야 한다.");
        questions[28] = ColorUtils.question("29. 남자와 여자가 같은 직업에 같은 연봉을 받고 있다면 실은 여자가 더 유능할 것이다.");
        questions[29] = ColorUtils.question("30. 한국사회는 징병제가 있기 때문에 남자에게 더 불리한 사회이다.");
        questions[30] = ColorUtils.question("31. 미국의 흑인 차별은 어느 정도 정당한 근거가 있다.");
        questions[31] = ColorUtils.question("32. 남자들과 비교했을 때 여자들은 안정적인 인간관계 없이 행복하기 어렵다.");
        questions[32] = ColorUtils.question("33. '여배우', '여류시인', '여기자' 등 직업 앞에 성별을 붙이는 것은 여성의 가치를 평가 절하하는 방법 중 하나다.");
        questions[33] = ColorUtils.question("34. 전통적 가족제도를 유지하는 것은 그 자체로 가치가 있다.");
        questions[34] = ColorUtils.question("35. 방송의 수어해설화면은 농인의 권리를 위한 당연한 조치이므로 지금보다 더 큰 사이즈로, 모든 방송에 나와야 한다.");
        questions[35] = ColorUtils.question("36. 정부는 공직의 일정 비율을 여성에게 할당해야 한다.");
        questions[36] = ColorUtils.question("37. 남성의 평균 임금이 여성보다 높다면 그건 남성이 더 좋은 성과를 냈기 때문이다.");
        questions[37] = ColorUtils.question("38. 거주가 아닌 투기 목적의 부동산 구입 행위는 규제되어야 한다.");
        questions[38] = ColorUtils.question("39. 상속으로 부를 얻는 것은 정당하다.");
        questions[39] = ColorUtils.question("40. 우리 사회에서는 사형 집행이 필요하다.");
        questions[40] = ColorUtils.question("41. 우리나라로 들어오는 이민자는 그 수를 최소화시켜야한다.");
        questions[41] = ColorUtils.question("42. 경쟁은 일반적으로 세상을 더 좋게 만든다.");
        questions[42] = ColorUtils.question("43. 일반 대중들은 그릇된 결정을 내릴 때가 많다.");
        questions[43] = ColorUtils.question("44. 남자와 여자의 차이는 자명하기 때문에 각자 별개의 사회적 역할을 수행하며 상호 보완하는 것이 이상적이다.");
        questions[44] = ColorUtils.question("45. 자본주의는 그 어떤 경제 시스템보다 우월하다.");
        questions[45] = ColorUtils.question("46. 정부는 부의 재분배에 지금보다 더 힘써야 한다.");
        questions[46] = ColorUtils.question("47. 납세자의 세금이 순수예술을 진흥하는 것에 사용되어서는 안 된다.");
        questions[47] = ColorUtils.question("48. 다수를 위해 소수가 희생하고 따르는 것이 민주주의의 원칙이다.");
    }

    public String getQuestion(int index){
        return questions[index];
    }

    public int getTotalQuestions(){
        return totalQuestions;
    }





}
