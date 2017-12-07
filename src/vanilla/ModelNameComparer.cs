﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System.Collections.Generic;
using AutoRest.Core.Model;
using AutoRest.Java.DanModel;

namespace AutoRest.Java
{
    public class ModelNameComparer : IEqualityComparer<ModelType>
    {
        private ModelNameComparer() { }
        internal static ModelNameComparer Instance { get; } = new ModelNameComparer();

        public bool Equals(ModelType x, ModelType y)
        {
            return DanCodeGenerator.GetIModelTypeName(x).Equals(DanCodeGenerator.GetIModelTypeName(y)) || x.XmlName.Equals(y.XmlName);
        }

        public int GetHashCode(ModelType obj)
        {
            return DanCodeGenerator.GetIModelTypeName(obj).GetHashCode() ^ obj.XmlName.GetHashCode();
        }
    }
}
