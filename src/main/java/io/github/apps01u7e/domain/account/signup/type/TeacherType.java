package io.github.apps01u7e.domain.account.signup.type;

/**
 * 교사분류 를 명시한 모델입니다.
 * 가입 도메인 내에서 범용적으로 사용됩니다.
 *
 * @author JeeInho
 * @version 0.0.1alpha-RELEASE
 * @since 0.0.1alpha-RELEASE
 */
public enum TeacherType {
    /**
     * 담임교사가 아닌 교사중, 전공과목을 가르치는 교사
     */
    전공교사,
    /**
     * 담임교사가 아닌 교사중, 교과과목을 가르치는 교사
     */
    교과교사,
    /**
     * 상담교사, 보건교사 등 과목/담임 교사가 아닐 경우
     */
    그외,

    /**
     * 1학년 담임교사
     */
    담임_1학년,
    /**
     * 2학년 담임교사
     */
    담임_2학년,
    /**
     * 3학년 담임교사
     */
    담임_3학년
}
