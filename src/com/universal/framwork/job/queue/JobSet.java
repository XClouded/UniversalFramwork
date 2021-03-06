package com.universal.framwork.job.queue;


import java.util.Collection;

import com.universal.framwork.job.JobHolder;

/**
 * An interface for Job Containers
 * It is very similar to SortedSet
 */
public interface JobSet {
    public JobHolder peek(Collection<String> excludeGroupIds);
    public JobHolder poll(Collection<String> excludeGroupIds);
    public JobHolder findById(long id);
    public boolean offer(JobHolder holder);
    public boolean remove(JobHolder holder);
    public void clear();
    public int size();
    public CountWithGroupIdsResult countReadyJobs(long now, Collection<String> excludeGroups);
    public CountWithGroupIdsResult countReadyJobs(Collection<String> excludeGroups);
}
