package com.jiaruiblog.foxglove.schema;

import lombok.Data;

@Data
public class Pose {

    private Vector3 position;

    private Quaternion orientation;
}
