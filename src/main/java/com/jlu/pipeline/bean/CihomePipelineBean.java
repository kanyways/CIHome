package com.jlu.pipeline.bean;

import com.jlu.branch.bean.BranchType;
import com.jlu.compile.bean.CompileBuildBean;
import com.jlu.github.model.GitHubCommit;
import com.jlu.release.bean.ReleaseBean;

/**
 * Created by niuwanpeng on 17/4/25.
 *
 * 流水线bean
 * 包含一条流水线的基本信息
 */
public class CihomePipelineBean {

    private int pipelineBuildId;

    private int moduleId;

    private String revision;

    private String module;

    private BranchType branchType;

    private CompileBuildBean compileBuildBean;

    private GitHubCommit gitHubCommit;

    private ReleaseBean releaseBean;

    public int getPipelineBuildId() {
        return pipelineBuildId;
    }

    public void setPipelineBuildId(int pipelineBuildId) {
        this.pipelineBuildId = pipelineBuildId;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public BranchType getBranchType() {
        return branchType;
    }

    public void setBranchType(BranchType branchType) {
        this.branchType = branchType;
    }

    public CompileBuildBean getCompileBuildBean() {
        return compileBuildBean;
    }

    public void setCompileBuildBean(CompileBuildBean compileBuildBean) {
        this.compileBuildBean = compileBuildBean;
    }

    public GitHubCommit getGitHubCommit() {
        return gitHubCommit;
    }

    public void setGitHubCommit(GitHubCommit gitHubCommit) {
        this.gitHubCommit = gitHubCommit;
    }

    public ReleaseBean getReleaseBean() {
        return releaseBean;
    }

    public void setReleaseBean(ReleaseBean releaseBean) {
        this.releaseBean = releaseBean;
    }
}
