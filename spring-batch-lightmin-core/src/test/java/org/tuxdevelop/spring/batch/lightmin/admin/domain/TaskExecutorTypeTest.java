package org.tuxdevelop.spring.batch.lightmin.admin.domain;


import org.junit.Test;
import org.tuxdevelop.spring.batch.lightmin.exception.SpringBatchLightminApplicationException;

import static org.assertj.core.api.Assertions.assertThat;

public class TaskExecutorTypeTest {

    @Test
    public void getByIdSYNCHRONOUSTest() {
        final TaskExecutorType taskExecutorType = TaskExecutorType.getById(1L);
        assertThat(taskExecutorType).isEqualTo(TaskExecutorType.SYNCHRONOUS);
    }

    @Test
    public void getByIdASYNCHRONOUSTest() {
        final TaskExecutorType taskExecutorType = TaskExecutorType.getById(2L);
        assertThat(taskExecutorType).isEqualTo(TaskExecutorType.ASYNCHRONOUS);
    }

    @Test(expected = SpringBatchLightminApplicationException.class)
    public void getByIdUnknownTest() {
        TaskExecutorType.getById(-100L);
    }
}
