package others


/**
 * Label
 *
 * 직전의 Jumps 에서 run으로 루프를 탈출했다.
 * 커스텀이 가능함. 대신 용법이 다름..
 *
 * 다만,
 *
 * 사용 권장하지는 않음. 마치 40년 전 goto 같은 느낌 ㅡㅡ;;
 */

fun main() {

    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j ==2 ) {
                break@loop
            }
            print("${i} ${j}")
        }
    }

    /**
     * 실행시켜보면 알겠지만 j의 loop를 탈출하는게 아니라 i까지 다 나가버림.
     * 쓰지마..
     */


}