package com.musicplayer.aspects;

import com.musicplayer.config.Colors;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(-10)
public class LoggingAspect implements Colors {

    @Before("com.musicplayer.aspects.Pointcuts.playMusicPointcut()")
    public void beforePlayMusicAdvice() {
        System.out.println(ANSI_GREEN + "beforePlayMusicAdvice: start play music" + ANSI_RESET);
    }

    @Before("com.musicplayer.aspects.Pointcuts.addMusicInPlaylist()")
    public void beforeAddMusicInPlaylistAdvice() {
        System.out.println(ANSI_GREEN + "beforeAddMusicInPlaylistAdvice: trying add a music" + ANSI_RESET);
    }

    @Around("com.musicplayer.aspects.Pointcuts.getPlaylist()")
    public Object aroundGetPlaylist(ProceedingJoinPoint joinPoint) {
        System.out.println(ANSI_GREEN + "aroundGetPlaylist: start get playlist" + ANSI_RESET);

        Object object = null;
        try {
            object =joinPoint.proceed();
        } catch (Throwable e) {
            System.out.println(ANSI_CYAN + "aroundReturnBookLoggingAdvice: handling exception " + e + ANSI_CYAN);
        }

        System.out.println(ANSI_GREEN + "aroundGetPlaylist: playlist received" + ANSI_RESET);
        return object;
    }

    @AfterReturning("com.musicplayer.aspects.Pointcuts.getPlaylist()")
    public void afterReturnGetPlaylist() {
        System.out.println(ANSI_GREEN + "afterReturnGetPlaylist: method getPlaylist() has been completed");
    }
}
