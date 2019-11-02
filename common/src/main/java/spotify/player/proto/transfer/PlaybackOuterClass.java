// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: playback.proto

package spotify.player.proto.transfer;

public final class PlaybackOuterClass {
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_spotify_player_proto_transfer_Playback_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_spotify_player_proto_transfer_Playback_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        java.lang.String[] descriptorData = {
                "\n\016playback.proto\022\035spotify.player.proto.t" +
                        "ransfer\032\023context_track.proto\"\245\001\n\010Playbac" +
                        "k\022\021\n\ttimestamp\030\001 \001(\003\022 \n\030position_as_of_t" +
                        "imestamp\030\002 \001(\005\022\026\n\016playback_speed\030\003 \001(\001\022\021" +
                        "\n\tis_paused\030\004 \001(\010\0229\n\rcurrent_track\030\005 \001(\013" +
                        "2\".spotify.player.proto.ContextTrackB\002H\002"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                                spotify.player.proto.ContextTrackOuterClass.getDescriptor(),
                        }, assigner);
        internal_static_spotify_player_proto_transfer_Playback_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_spotify_player_proto_transfer_Playback_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_spotify_player_proto_transfer_Playback_descriptor,
                new java.lang.String[]{"Timestamp", "PositionAsOfTimestamp", "PlaybackSpeed", "IsPaused", "CurrentTrack",});
        spotify.player.proto.ContextTrackOuterClass.getDescriptor();
    }

    private PlaybackOuterClass() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    public interface PlaybackOrBuilder extends
            // @@protoc_insertion_point(interface_extends:spotify.player.proto.transfer.Playback)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>optional int64 timestamp = 1;</code>
         */
        boolean hasTimestamp();

        /**
         * <code>optional int64 timestamp = 1;</code>
         */
        long getTimestamp();

        /**
         * <code>optional int32 position_as_of_timestamp = 2;</code>
         */
        boolean hasPositionAsOfTimestamp();

        /**
         * <code>optional int32 position_as_of_timestamp = 2;</code>
         */
        int getPositionAsOfTimestamp();

        /**
         * <code>optional double playback_speed = 3;</code>
         */
        boolean hasPlaybackSpeed();

        /**
         * <code>optional double playback_speed = 3;</code>
         */
        double getPlaybackSpeed();

        /**
         * <code>optional bool is_paused = 4;</code>
         */
        boolean hasIsPaused();

        /**
         * <code>optional bool is_paused = 4;</code>
         */
        boolean getIsPaused();

        /**
         * <code>optional .spotify.player.proto.ContextTrack current_track = 5;</code>
         */
        boolean hasCurrentTrack();

        /**
         * <code>optional .spotify.player.proto.ContextTrack current_track = 5;</code>
         */
        spotify.player.proto.ContextTrackOuterClass.ContextTrack getCurrentTrack();

        /**
         * <code>optional .spotify.player.proto.ContextTrack current_track = 5;</code>
         */
        spotify.player.proto.ContextTrackOuterClass.ContextTrackOrBuilder getCurrentTrackOrBuilder();
    }

    /**
     * Protobuf type {@code spotify.player.proto.transfer.Playback}
     */
    public static final class Playback extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:spotify.player.proto.transfer.Playback)
            PlaybackOrBuilder {
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        public static final int POSITION_AS_OF_TIMESTAMP_FIELD_NUMBER = 2;
        public static final int PLAYBACK_SPEED_FIELD_NUMBER = 3;
        public static final int IS_PAUSED_FIELD_NUMBER = 4;
        public static final int CURRENT_TRACK_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:spotify.player.proto.transfer.Playback)
        private static final spotify.player.proto.transfer.PlaybackOuterClass.Playback DEFAULT_INSTANCE;
        @java.lang.Deprecated
        public static final com.google.protobuf.Parser<Playback>
                PARSER = new com.google.protobuf.AbstractParser<Playback>() {
            @java.lang.Override
            public Playback parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                Builder builder = newBuilder();
                try {
                    builder.mergeFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(builder.buildPartial());
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e.getMessage()).setUnfinishedMessage(
                            builder.buildPartial());
                }
                return builder.buildPartial();
            }
        };

        static {
            DEFAULT_INSTANCE = new spotify.player.proto.transfer.PlaybackOuterClass.Playback();
        }

        private int bitField0_;
        private long timestamp_;
        private int positionAsOfTimestamp_;
        private double playbackSpeed_;
        private boolean isPaused_;
        private spotify.player.proto.ContextTrackOuterClass.ContextTrack currentTrack_;

        // Use Playback.newBuilder() to construct.
        private Playback(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Playback() {
            timestamp_ = 0L;
            positionAsOfTimestamp_ = 0;
            playbackSpeed_ = 0D;
            isPaused_ = false;
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return spotify.player.proto.transfer.PlaybackOuterClass.internal_static_spotify_player_proto_transfer_Playback_descriptor;
        }

        public static spotify.player.proto.transfer.PlaybackOuterClass.Playback parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static spotify.player.proto.transfer.PlaybackOuterClass.Playback parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static spotify.player.proto.transfer.PlaybackOuterClass.Playback parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static spotify.player.proto.transfer.PlaybackOuterClass.Playback parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static spotify.player.proto.transfer.PlaybackOuterClass.Playback parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static spotify.player.proto.transfer.PlaybackOuterClass.Playback parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static spotify.player.proto.transfer.PlaybackOuterClass.Playback parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static spotify.player.proto.transfer.PlaybackOuterClass.Playback parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static spotify.player.proto.transfer.PlaybackOuterClass.Playback parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static spotify.player.proto.transfer.PlaybackOuterClass.Playback parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static spotify.player.proto.transfer.PlaybackOuterClass.Playback parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static spotify.player.proto.transfer.PlaybackOuterClass.Playback parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(spotify.player.proto.transfer.PlaybackOuterClass.Playback prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static spotify.player.proto.transfer.PlaybackOuterClass.Playback getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<Playback> parser() {
            return PARSER;
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return spotify.player.proto.transfer.PlaybackOuterClass.internal_static_spotify_player_proto_transfer_Playback_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            spotify.player.proto.transfer.PlaybackOuterClass.Playback.class, spotify.player.proto.transfer.PlaybackOuterClass.Playback.Builder.class);
        }

        /**
         * <code>optional int64 timestamp = 1;</code>
         */
        public boolean hasTimestamp() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>optional int64 timestamp = 1;</code>
         */
        public long getTimestamp() {
            return timestamp_;
        }

        /**
         * <code>optional int32 position_as_of_timestamp = 2;</code>
         */
        public boolean hasPositionAsOfTimestamp() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>optional int32 position_as_of_timestamp = 2;</code>
         */
        public int getPositionAsOfTimestamp() {
            return positionAsOfTimestamp_;
        }

        /**
         * <code>optional double playback_speed = 3;</code>
         */
        public boolean hasPlaybackSpeed() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }

        /**
         * <code>optional double playback_speed = 3;</code>
         */
        public double getPlaybackSpeed() {
            return playbackSpeed_;
        }

        /**
         * <code>optional bool is_paused = 4;</code>
         */
        public boolean hasIsPaused() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }

        /**
         * <code>optional bool is_paused = 4;</code>
         */
        public boolean getIsPaused() {
            return isPaused_;
        }

        /**
         * <code>optional .spotify.player.proto.ContextTrack current_track = 5;</code>
         */
        public boolean hasCurrentTrack() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }

        /**
         * <code>optional .spotify.player.proto.ContextTrack current_track = 5;</code>
         */
        public spotify.player.proto.ContextTrackOuterClass.ContextTrack getCurrentTrack() {
            return currentTrack_ == null ? spotify.player.proto.ContextTrackOuterClass.ContextTrack.getDefaultInstance() : currentTrack_;
        }

        /**
         * <code>optional .spotify.player.proto.ContextTrack current_track = 5;</code>
         */
        public spotify.player.proto.ContextTrackOuterClass.ContextTrackOrBuilder getCurrentTrackOrBuilder() {
            return currentTrack_ == null ? spotify.player.proto.ContextTrackOuterClass.ContextTrack.getDefaultInstance() : currentTrack_;
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<Playback> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public spotify.player.proto.transfer.PlaybackOuterClass.Playback getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * Protobuf type {@code spotify.player.proto.transfer.Playback}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:spotify.player.proto.transfer.Playback)
                spotify.player.proto.transfer.PlaybackOuterClass.PlaybackOrBuilder {
            private int bitField0_;
            private long timestamp_;
            private int positionAsOfTimestamp_;
            private double playbackSpeed_;
            private boolean isPaused_;
            private spotify.player.proto.ContextTrackOuterClass.ContextTrack currentTrack_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    spotify.player.proto.ContextTrackOuterClass.ContextTrack, spotify.player.proto.ContextTrackOuterClass.ContextTrack.Builder, spotify.player.proto.ContextTrackOuterClass.ContextTrackOrBuilder> currentTrackBuilder_;

            // Construct using spotify.player.proto.transfer.PlaybackOuterClass.Playback.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return spotify.player.proto.transfer.PlaybackOuterClass.internal_static_spotify_player_proto_transfer_Playback_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return spotify.player.proto.transfer.PlaybackOuterClass.internal_static_spotify_player_proto_transfer_Playback_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                spotify.player.proto.transfer.PlaybackOuterClass.Playback.class, spotify.player.proto.transfer.PlaybackOuterClass.Playback.Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getCurrentTrackFieldBuilder();
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                timestamp_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000001);
                positionAsOfTimestamp_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                playbackSpeed_ = 0D;
                bitField0_ = (bitField0_ & ~0x00000004);
                isPaused_ = false;
                bitField0_ = (bitField0_ & ~0x00000008);
                if (currentTrackBuilder_ == null) {
                    currentTrack_ = null;
                } else {
                    currentTrackBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000010);
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return spotify.player.proto.transfer.PlaybackOuterClass.internal_static_spotify_player_proto_transfer_Playback_descriptor;
            }

            @java.lang.Override
            public spotify.player.proto.transfer.PlaybackOuterClass.Playback getDefaultInstanceForType() {
                return spotify.player.proto.transfer.PlaybackOuterClass.Playback.getDefaultInstance();
            }

            @java.lang.Override
            public spotify.player.proto.transfer.PlaybackOuterClass.Playback build() {
                spotify.player.proto.transfer.PlaybackOuterClass.Playback result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public spotify.player.proto.transfer.PlaybackOuterClass.Playback buildPartial() {
                spotify.player.proto.transfer.PlaybackOuterClass.Playback result = new spotify.player.proto.transfer.PlaybackOuterClass.Playback(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.timestamp_ = timestamp_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.positionAsOfTimestamp_ = positionAsOfTimestamp_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.playbackSpeed_ = playbackSpeed_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.isPaused_ = isPaused_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                if (currentTrackBuilder_ == null) {
                    result.currentTrack_ = currentTrack_;
                } else {
                    result.currentTrack_ = currentTrackBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            /**
             * <code>optional int64 timestamp = 1;</code>
             */
            public boolean hasTimestamp() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            /**
             * <code>optional int64 timestamp = 1;</code>
             */
            public long getTimestamp() {
                return timestamp_;
            }

            /**
             * <code>optional int64 timestamp = 1;</code>
             */
            public Builder setTimestamp(long value) {
                bitField0_ |= 0x00000001;
                timestamp_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional int64 timestamp = 1;</code>
             */
            public Builder clearTimestamp() {
                bitField0_ = (bitField0_ & ~0x00000001);
                timestamp_ = 0L;
                onChanged();
                return this;
            }

            /**
             * <code>optional int32 position_as_of_timestamp = 2;</code>
             */
            public boolean hasPositionAsOfTimestamp() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            /**
             * <code>optional int32 position_as_of_timestamp = 2;</code>
             */
            public int getPositionAsOfTimestamp() {
                return positionAsOfTimestamp_;
            }

            /**
             * <code>optional int32 position_as_of_timestamp = 2;</code>
             */
            public Builder setPositionAsOfTimestamp(int value) {
                bitField0_ |= 0x00000002;
                positionAsOfTimestamp_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional int32 position_as_of_timestamp = 2;</code>
             */
            public Builder clearPositionAsOfTimestamp() {
                bitField0_ = (bitField0_ & ~0x00000002);
                positionAsOfTimestamp_ = 0;
                onChanged();
                return this;
            }

            /**
             * <code>optional double playback_speed = 3;</code>
             */
            public boolean hasPlaybackSpeed() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }

            /**
             * <code>optional double playback_speed = 3;</code>
             */
            public double getPlaybackSpeed() {
                return playbackSpeed_;
            }

            /**
             * <code>optional double playback_speed = 3;</code>
             */
            public Builder setPlaybackSpeed(double value) {
                bitField0_ |= 0x00000004;
                playbackSpeed_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional double playback_speed = 3;</code>
             */
            public Builder clearPlaybackSpeed() {
                bitField0_ = (bitField0_ & ~0x00000004);
                playbackSpeed_ = 0D;
                onChanged();
                return this;
            }

            /**
             * <code>optional bool is_paused = 4;</code>
             */
            public boolean hasIsPaused() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }

            /**
             * <code>optional bool is_paused = 4;</code>
             */
            public boolean getIsPaused() {
                return isPaused_;
            }

            /**
             * <code>optional bool is_paused = 4;</code>
             */
            public Builder setIsPaused(boolean value) {
                bitField0_ |= 0x00000008;
                isPaused_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional bool is_paused = 4;</code>
             */
            public Builder clearIsPaused() {
                bitField0_ = (bitField0_ & ~0x00000008);
                isPaused_ = false;
                onChanged();
                return this;
            }

            /**
             * <code>optional .spotify.player.proto.ContextTrack current_track = 5;</code>
             */
            public boolean hasCurrentTrack() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }

            /**
             * <code>optional .spotify.player.proto.ContextTrack current_track = 5;</code>
             */
            public spotify.player.proto.ContextTrackOuterClass.ContextTrack getCurrentTrack() {
                if (currentTrackBuilder_ == null) {
                    return currentTrack_ == null ? spotify.player.proto.ContextTrackOuterClass.ContextTrack.getDefaultInstance() : currentTrack_;
                } else {
                    return currentTrackBuilder_.getMessage();
                }
            }

            /**
             * <code>optional .spotify.player.proto.ContextTrack current_track = 5;</code>
             */
            public Builder setCurrentTrack(spotify.player.proto.ContextTrackOuterClass.ContextTrack value) {
                if (currentTrackBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    currentTrack_ = value;
                    onChanged();
                } else {
                    currentTrackBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000010;
                return this;
            }

            /**
             * <code>optional .spotify.player.proto.ContextTrack current_track = 5;</code>
             */
            public Builder setCurrentTrack(
                    spotify.player.proto.ContextTrackOuterClass.ContextTrack.Builder builderForValue) {
                if (currentTrackBuilder_ == null) {
                    currentTrack_ = builderForValue.build();
                    onChanged();
                } else {
                    currentTrackBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000010;
                return this;
            }

            /**
             * <code>optional .spotify.player.proto.ContextTrack current_track = 5;</code>
             */
            public Builder mergeCurrentTrack(spotify.player.proto.ContextTrackOuterClass.ContextTrack value) {
                if (currentTrackBuilder_ == null) {
                    if (((bitField0_ & 0x00000010) == 0x00000010) &&
                            currentTrack_ != null &&
                            currentTrack_ != spotify.player.proto.ContextTrackOuterClass.ContextTrack.getDefaultInstance()) {
                        currentTrack_ =
                                spotify.player.proto.ContextTrackOuterClass.ContextTrack.newBuilder(currentTrack_).mergeFrom(value).buildPartial();
                    } else {
                        currentTrack_ = value;
                    }
                    onChanged();
                } else {
                    currentTrackBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000010;
                return this;
            }

            /**
             * <code>optional .spotify.player.proto.ContextTrack current_track = 5;</code>
             */
            public Builder clearCurrentTrack() {
                if (currentTrackBuilder_ == null) {
                    currentTrack_ = null;
                    onChanged();
                } else {
                    currentTrackBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000010);
                return this;
            }

            /**
             * <code>optional .spotify.player.proto.ContextTrack current_track = 5;</code>
             */
            public spotify.player.proto.ContextTrackOuterClass.ContextTrack.Builder getCurrentTrackBuilder() {
                bitField0_ |= 0x00000010;
                onChanged();
                return getCurrentTrackFieldBuilder().getBuilder();
            }

            /**
             * <code>optional .spotify.player.proto.ContextTrack current_track = 5;</code>
             */
            public spotify.player.proto.ContextTrackOuterClass.ContextTrackOrBuilder getCurrentTrackOrBuilder() {
                if (currentTrackBuilder_ != null) {
                    return currentTrackBuilder_.getMessageOrBuilder();
                } else {
                    return currentTrack_ == null ?
                            spotify.player.proto.ContextTrackOuterClass.ContextTrack.getDefaultInstance() : currentTrack_;
                }
            }

            /**
             * <code>optional .spotify.player.proto.ContextTrack current_track = 5;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    spotify.player.proto.ContextTrackOuterClass.ContextTrack, spotify.player.proto.ContextTrackOuterClass.ContextTrack.Builder, spotify.player.proto.ContextTrackOuterClass.ContextTrackOrBuilder>
            getCurrentTrackFieldBuilder() {
                if (currentTrackBuilder_ == null) {
                    currentTrackBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            spotify.player.proto.ContextTrackOuterClass.ContextTrack, spotify.player.proto.ContextTrackOuterClass.ContextTrack.Builder, spotify.player.proto.ContextTrackOuterClass.ContextTrackOrBuilder>(
                            getCurrentTrack(),
                            getParentForChildren(),
                            isClean());
                    currentTrack_ = null;
                }
                return currentTrackBuilder_;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:spotify.player.proto.transfer.Playback)
        }

    }

    // @@protoc_insertion_point(outer_class_scope)
}