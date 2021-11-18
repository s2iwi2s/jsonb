CREATE TABLE public.event_log
(
    id bigserial,
    data jsonb,
    PRIMARY KEY (id)
);