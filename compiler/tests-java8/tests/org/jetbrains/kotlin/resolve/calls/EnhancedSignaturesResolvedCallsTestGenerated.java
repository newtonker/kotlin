/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.resolve.calls;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/resolvedCalls/enhancedSignatures")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class EnhancedSignaturesResolvedCallsTestGenerated extends AbstractEnhancedSignaturesResolvedCallsTest {
    public void testAllFilesPresentInEnhancedSignatures() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/enhancedSignatures"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("compiler/testData/resolvedCalls/enhancedSignatures/collection")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Collection extends AbstractEnhancedSignaturesResolvedCallsTest {
        public void testAllFilesPresentInCollection() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/enhancedSignatures/collection"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("collectionRemoveIf.kt")
        public void testCollectionRemoveIf() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/resolvedCalls/enhancedSignatures/collection/collectionRemoveIf.kt");
            doTest(fileName);
        }

        @TestMetadata("collectionSpliterator.kt")
        public void testCollectionSpliterator() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/resolvedCalls/enhancedSignatures/collection/collectionSpliterator.kt");
            doTest(fileName);
        }

        @TestMetadata("collectionStream.kt")
        public void testCollectionStream() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/resolvedCalls/enhancedSignatures/collection/collectionStream.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/resolvedCalls/enhancedSignatures/iterable")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Iterable extends AbstractEnhancedSignaturesResolvedCallsTest {
        public void testAllFilesPresentInIterable() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/enhancedSignatures/iterable"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("iterableSpliterator.kt")
        public void testIterableSpliterator() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/resolvedCalls/enhancedSignatures/iterable/iterableSpliterator.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/resolvedCalls/enhancedSignatures/iterator")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Iterator extends AbstractEnhancedSignaturesResolvedCallsTest {
        public void testAllFilesPresentInIterator() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/enhancedSignatures/iterator"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("iteratorForEachRemaining.kt")
        public void testIteratorForEachRemaining() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/resolvedCalls/enhancedSignatures/iterator/iteratorForEachRemaining.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/resolvedCalls/enhancedSignatures/list")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class List extends AbstractEnhancedSignaturesResolvedCallsTest {
        public void testAllFilesPresentInList() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/enhancedSignatures/list"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("listReplaceAll.kt")
        public void testListReplaceAll() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/resolvedCalls/enhancedSignatures/list/listReplaceAll.kt");
            doTest(fileName);
        }

        @TestMetadata("listStream.kt")
        public void testListStream() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/resolvedCalls/enhancedSignatures/list/listStream.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/resolvedCalls/enhancedSignatures/map")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Map extends AbstractEnhancedSignaturesResolvedCallsTest {
        public void testAllFilesPresentInMap() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/enhancedSignatures/map"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("mapCompute.kt")
        public void testMapCompute() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/resolvedCalls/enhancedSignatures/map/mapCompute.kt");
            doTest(fileName);
        }

        @TestMetadata("mapComputeIfAbsent.kt")
        public void testMapComputeIfAbsent() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/resolvedCalls/enhancedSignatures/map/mapComputeIfAbsent.kt");
            doTest(fileName);
        }

        @TestMetadata("mapComputeIfPresent.kt")
        public void testMapComputeIfPresent() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/resolvedCalls/enhancedSignatures/map/mapComputeIfPresent.kt");
            doTest(fileName);
        }

        @TestMetadata("mapForEach.kt")
        public void testMapForEach() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/resolvedCalls/enhancedSignatures/map/mapForEach.kt");
            doTest(fileName);
        }

        @TestMetadata("mapMerge.kt")
        public void testMapMerge() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/resolvedCalls/enhancedSignatures/map/mapMerge.kt");
            doTest(fileName);
        }

        @TestMetadata("mapPutIfAbsent.kt")
        public void testMapPutIfAbsent() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/resolvedCalls/enhancedSignatures/map/mapPutIfAbsent.kt");
            doTest(fileName);
        }

        @TestMetadata("mapReplace.kt")
        public void testMapReplace() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/resolvedCalls/enhancedSignatures/map/mapReplace.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/resolvedCalls/enhancedSignatures/optional")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Optional extends AbstractEnhancedSignaturesResolvedCallsTest {
        public void testAllFilesPresentInOptional() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/enhancedSignatures/optional"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("optionalEmpty.kt")
        public void testOptionalEmpty() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/resolvedCalls/enhancedSignatures/optional/optionalEmpty.kt");
            doTest(fileName);
        }

        @TestMetadata("optionalGet.kt")
        public void testOptionalGet() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/resolvedCalls/enhancedSignatures/optional/optionalGet.kt");
            doTest(fileName);
        }

        @TestMetadata("optionalIfPresent.kt")
        public void testOptionalIfPresent() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/resolvedCalls/enhancedSignatures/optional/optionalIfPresent.kt");
            doTest(fileName);
        }

        @TestMetadata("optionalOf.kt")
        public void testOptionalOf() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/resolvedCalls/enhancedSignatures/optional/optionalOf.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/resolvedCalls/enhancedSignatures/references")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class References extends AbstractEnhancedSignaturesResolvedCallsTest {
        public void testAllFilesPresentInReferences() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/enhancedSignatures/references"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("softReference.kt")
        public void testSoftReference() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/resolvedCalls/enhancedSignatures/references/softReference.kt");
            doTest(fileName);
        }

        @TestMetadata("weakReference.kt")
        public void testWeakReference() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/resolvedCalls/enhancedSignatures/references/weakReference.kt");
            doTest(fileName);
        }
    }
}