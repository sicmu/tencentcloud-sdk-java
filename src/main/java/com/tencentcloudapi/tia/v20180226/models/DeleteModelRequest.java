/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tia.v20180226.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteModelRequest  extends AbstractModel{

    /**
    * 要删除的模型名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 要删除的模型所在的集群名称
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 模型类型
    */
    @SerializedName("ServType")
    @Expose
    private String ServType;

    /**
     * 获取要删除的模型名称
     * @return Name 要删除的模型名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置要删除的模型名称
     * @param Name 要删除的模型名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取要删除的模型所在的集群名称
     * @return Cluster 要删除的模型所在的集群名称
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * 设置要删除的模型所在的集群名称
     * @param Cluster 要删除的模型所在的集群名称
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * 获取模型类型
     * @return ServType 模型类型
     */
    public String getServType() {
        return this.ServType;
    }

    /**
     * 设置模型类型
     * @param ServType 模型类型
     */
    public void setServType(String ServType) {
        this.ServType = ServType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "ServType", this.ServType);

    }
}

