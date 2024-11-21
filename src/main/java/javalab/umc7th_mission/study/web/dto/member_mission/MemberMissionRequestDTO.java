package javalab.umc7th_mission.study.web.dto.member_mission;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.time.LocalDate;

public class MemberMissionRequestDTO {
    @Getter
    public static class AddMemberMissionDto{
        @NotNull(message = "회원 id는 필수 항목입니다.")
        Long memberId;

        @NotNull(message = "미션 id는 필수 항목입니다.")
        Long missionId;

        @NotNull(message = "회원 미션 시작 날짜는 필수 항목입니다.")
        LocalDate startDate;
    }
}
