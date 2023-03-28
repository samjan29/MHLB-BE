package com.gigajet.mhlb.domain.managing.dto;

import com.gigajet.mhlb.domain.user.entity.User;
import com.gigajet.mhlb.domain.workspace.entity.Workspace;
import com.gigajet.mhlb.domain.workspaceuser.entity.WorkspaceUserRole;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class ManagingResponseDto {
    @Getter
    public static class Management {
        private Long workspaceId;

        private String workspaceImage;

        private String workspaceTitle;

        private String workspaceDesc;

        private WorkspaceUserRole userRole;

        public Management(Workspace workspace, WorkspaceUserRole role) {
            this.workspaceId = workspace.getId();

            this.workspaceImage = workspace.getImage();

            this.workspaceTitle = workspace.getTitle();

            this.workspaceDesc = workspace.getDescription();

            this.userRole = role;
        }
    }

    @Getter
    public static class People {
        private Long userId;

        private String userName;

        private String userEmail;

        private String userImage;

        private String userJob;

        private WorkspaceUserRole userRole;

        public People(User user, WorkspaceUserRole role) {
            this.userId = user.getId();

            this.userName = user.getUsername();

            this.userEmail = user.getEmail();

            this.userImage = user.getImage();

            this.userJob = user.getJob();

            this.userRole = role;
        }
    }

    @Getter
    @RequiredArgsConstructor
    public static class Image {

        private final String workspaceImage;

    }

    @Getter
    @RequiredArgsConstructor
    public static class Title {

        private final String workspaceTitle;

    }

    @Getter
    @RequiredArgsConstructor
    public static class Description {

        private final String workspaceDesc;

    }

    @Getter
    @RequiredArgsConstructor
    public static class Role {

        private final WorkspaceUserRole userRole;

    }

}