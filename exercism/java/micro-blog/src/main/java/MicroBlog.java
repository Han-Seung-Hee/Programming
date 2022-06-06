class MicroBlog {
    public String truncate(String input) {
        // 해답 1 regex로 처음 0~5 까지 (0~5] 잡아서 $1로 조지기
        //        return input.replaceAll("^(.{0,5}).*","$1");

        // 해답 2
        return input.codePoints() // input의 String 위치에 해당하는 intStream 생성
                .limit(5) // 그 수를 5개로 제한
                // 스트링 빌더 클래스 선언 , appendCodePoint로 분리 후 append
                .collect(StringBuilder::new ,StringBuilder::appendCodePoint,StringBuilder::append)
                // 스트링으로 변환
                .toString();
    }
}