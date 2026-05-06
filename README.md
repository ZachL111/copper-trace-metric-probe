# copper-trace-metric-probe

`copper-trace-metric-probe` keeps a focused Scala implementation around observability. The project goal is to package a Scala local lab for metric analysis with negative fixtures, human-readable error snapshots, and documented operating limits.

## Purpose

The point is to make a small domain rule concrete enough that a reader can change it and immediately see what broke.

## Copper Trace Metric Probe Review Notes

`baseline` and `stale` are the cases worth reading first. They show the optimistic and cautious ends of the fixture.

## What Is Covered

- `fixtures/domain_review.csv` adds cases for span volume and latency skew.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/copper-trace-metric-walkthrough.md` walks through the case spread.
- The Scala code includes a review path for `span volume` and `span volume`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Implementation Notes

The implementation keeps the scoring rule plain: reward signal and confidence, preserve slack, penalize drag, then classify the result into a review lane.

The Scala addition stays small enough to inspect in one sitting.

## Command

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Audit Path

The same command runs the local verification path. The highest-scoring domain case is `baseline` at 211, which lands in `ship`. The most cautious case is `stale` at 113, which lands in `watch`.

## Limits

The repository is intentionally scoped to local checks. I would expand it by adding adversarial fixtures before adding features.
